package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CompanyReaderFacadeTest {

    private BrandFetchReader mockBrandFetchReader;
    private PDLReader mockPDLReader;
    private CompanyReaderFacade companyReaderFacade;

    @BeforeEach
    void setUp() {
        mockBrandFetchReader = Mockito.mock(BrandFetchReader.class);
        mockPDLReader = Mockito.mock(PDLReader.class);
        companyReaderFacade = new CompanyReaderFacade();

        companyReaderFacade = new CompanyReaderFacade() {
            {
                this.reader1 = mockPDLReader;
                this.reader2 = mockBrandFetchReader;
            }
        };
    }

    @Test
    void testReadCompanyWithMockedReaders() throws Exception {
        Company companyFromPDL = new Company();
        companyFromPDL.setName("Test Company");
        companyFromPDL.setDescription("A company from PDL.");
        companyFromPDL.setLogo("pdl_logo.png");

        Company companyFromBrandFetch = new Company();
        companyFromBrandFetch.setName("Test Company");
        companyFromBrandFetch.setDescription("A company from BrandFetch.");
        companyFromBrandFetch.setLogo("brandfetch_logo.png");

        when(mockPDLReader.fetch("testcompany.com")).thenReturn(companyFromPDL);
        when(mockBrandFetchReader.fetch("testcompany.com")).thenReturn(companyFromBrandFetch);

        Company result = companyReaderFacade.readCompany("testcompany.com");

        assertNotNull(result);
        assertEquals("Test Company", result.getName());
        assertEquals("A company from PDL.", result.getDescription());
        assertEquals("pdl_logo.png", result.getLogo());
    }

    @Test
    void testReadCompanyWithNoResults() throws Exception {
        doThrow(new IOException("PDL API failed")).when(mockPDLReader).fetch("testcompany.com");
        doThrow(new IOException("BrandFetch API failed")).when(mockBrandFetchReader).fetch("testcompany.com");

        Company result = companyReaderFacade.readCompany("testcompany.com");

        assertNotNull(result);
        assertNull(result.getName());
        assertNull(result.getDescription());
        assertNull(result.getLogo());
    }

    @Test
    void testMergeCompanies() {
        Company company1 = new Company();
        company1.setName("PDL Name");
        company1.setDescription(null);
        company1.setLogo("pdl_logo.png");

        Company company2 = new Company();
        company2.setName(null);
        company2.setDescription("BrandFetch Description");
        company2.setLogo(null);

        Company result = companyReaderFacade.mergeCompanies(company1, company2);

        assertNotNull(result);
        assertEquals("PDL Name", result.getName());
        assertEquals("BrandFetch Description", result.getDescription());
        assertEquals("pdl_logo.png", result.getLogo());
    }
}
