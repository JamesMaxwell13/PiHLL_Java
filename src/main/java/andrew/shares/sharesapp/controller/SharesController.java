package andrew.shares.sharesapp.controller;

import andrew.shares.sharesapp.model.CompanyShare;
import andrew.shares.sharesapp.model.FindCompanyResponse;
import andrew.shares.sharesapp.service.SharesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/sharesapp/")
public class SharesController {
    private final SharesService sharesService;

    @Autowired
    public SharesController(SharesService sharesService) {
        this.sharesService = sharesService;
    }

    @GetMapping("find")
    public ResponseEntity<List<FindCompanyResponse>> getFindName(@RequestParam(value = "query") String query) {
        List<FindCompanyResponse> companiesName = sharesService.getCompanyList(query);
        return new ResponseEntity<>(companiesName, HttpStatus.OK);
    }

    @GetMapping("share")
    public ResponseEntity<CompanyShare> getShareApiInfo(@RequestParam(value = "symbol") String symbol) {
        CompanyShare shareResponse = sharesService.getShareRequest(symbol);
        return new ResponseEntity<>(shareResponse, HttpStatus.OK);
    }
}
