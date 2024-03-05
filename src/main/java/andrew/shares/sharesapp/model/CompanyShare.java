package andrew.shares.sharesapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyShare {

    private Float prevClose;

    private Float high;

    private Float low;

    private Float open;

    private Float lastSalePrice;

    private String lastUpdated;

    private String symbol;

    private String name;
}
