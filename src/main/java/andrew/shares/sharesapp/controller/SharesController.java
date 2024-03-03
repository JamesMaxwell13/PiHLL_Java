package andrew.shares.sharesapp.controller;

import andrew.shares.sharesapp.model.CompanyShare;
import andrew.shares.sharesapp.service.SharesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sharesapp")
public class SharesController {
    private final SharesService sharesService;

    @Autowired
    public SharesController(SharesService sharesService) {
        this.sharesService = sharesService;
    }

    @GetMapping
    public ResponseEntity<CompanyShare> getShareApiInfo(@RequestParam(value = "symbol", required = false) String symbol) {
        CompanyShare shareResponse = sharesService.getShareRequest(symbol);
        System.out.println(symbol);
        return new ResponseEntity<>(shareResponse, HttpStatus.OK);
    }
}
