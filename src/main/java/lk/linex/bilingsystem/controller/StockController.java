package lk.linex.bilingsystem.controller;

import lk.linex.bilingsystem.dto.ResponseDTO;
import lk.linex.bilingsystem.dto.ItemDTO;
import lk.linex.bilingsystem.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/stock/save")
public class StockController {
    private final StockService stockService;
    private final ResponseDTO responseDTO;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @PostMapping("/saveStock")
    public ResponseEntity<?> saveStock(@RequestBody ItemDTO itemDTO){
        System.out.println(itemDTO);
        String response = stockService.saveItem(itemDTO);

        System.out.println(response);

        /*set response data start*/
        responseDTO.setCode(response);
        responseDTO.setMessage(response);
        responseDTO.setContent(itemDTO);
        /*set response data end*/

        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


}
