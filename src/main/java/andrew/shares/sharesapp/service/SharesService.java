package andrew.shares.sharesapp.service;

import andrew.shares.sharesapp.model.CompanyShare;
import andrew.shares.sharesapp.model.FindCompanyResponse;

import java.util.List;


public interface SharesService {
    List<FindCompanyResponse> getCompanyList(String query);
    CompanyShare getShareRequest(String symbol);
    List<CompanyShare> getSharesList(List<FindCompanyResponse> companiesName);
}
