package andrew.shares.sharesapp.service;

import andrew.shares.sharesapp.model.CompanyShare;

public interface SharesService {
    CompanyShare getShareRequest(String symbol);
}
