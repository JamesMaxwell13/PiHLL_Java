package andrew.shares.sharesapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FindCompanyResponse {

    private String symbol;

    private String name;

    private String currency;

    private String stockExchange;
}
