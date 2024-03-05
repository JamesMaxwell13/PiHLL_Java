package andrew.shares.sharesapp.service;

import andrew.shares.sharesapp.model.CompanyShare;
import andrew.shares.sharesapp.model.FindCompanyResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SharesServiceImplement implements SharesService{
    @Value("${apikey}")
    private String apikey;

    @Override
    public List<FindCompanyResponse> getCompanyList(String query) {

    }

    @Override
    public List<CompanyShare> getSharesList(String query) {

    }

    @Override
    public CompanyShare getShareRequest(String symbol) {
        String getUrl = "https://financialmodelingprep.com/api/v3/otc/real-time-price/{symbol}?apikey={apikey}";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CompanyShare[]> responseEntity = restTemplate.getForEntity(getUrl, CompanyShare[].class, symbol, apikey);
        CompanyShare[] shareResponse = responseEntity.getBody();
        if (shareResponse != null && shareResponse.length == 1) {
            return shareResponse[0];
        } else {
            return null;
        }
    }
}
