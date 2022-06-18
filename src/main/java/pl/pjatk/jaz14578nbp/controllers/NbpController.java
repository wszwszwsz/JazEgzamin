package pl.pjatk.jaz14578nbp.controllers;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.jaz14578nbp.model.NbpModel;
import pl.pjatk.jaz14578nbp.service.NbpService;

import java.util.List;

@RestController
@RequestMapping("/nbp")
public class NbpController {

    private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }


    @GetMapping("/gold")
    @ApiOperation(value = "Get a average rate gold beetwen start and end date", notes = "Return average rate gold")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retvieved"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<Object> getNbp() {
        return ResponseEntity.ok(new NbpModel());
    }
}
