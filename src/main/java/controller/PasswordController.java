package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.password.password_manager.dto.PasswordRequestDTO;
import com.password.password_manager.model.GeneratedPassword;
import com.password.password_manager.model.PasswordPolicy;
import com.password.password_manager.service.PasswordGeneratorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/password")
public class PasswordController {

    private final PasswordGeneratorService passwordGeneratorService;

    @Autowired
    public PasswordController(PasswordGeneratorService passwordGeneratorService) {
        this.passwordGeneratorService = passwordGeneratorService;
    }

    @Operation(summary = "Genera una nuova password in base alla policy richiesta")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Password generata con successo"),
        @ApiResponse(responseCode = "400", description = "Dati della richiesta non validi")
    })
    @PostMapping("/generate")
    public GeneratedPassword generatePassword(@RequestBody PasswordRequestDTO request) {
        PasswordPolicy policy = new PasswordPolicy(
                request.getLength(),
                request.isIncludeUppercase(),
                request.isIncludeNumbers(),
                request.isIncludeSymbols()
        );
        return passwordGeneratorService.generate(policy);
    }
}
