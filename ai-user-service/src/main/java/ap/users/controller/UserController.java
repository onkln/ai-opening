package ap.users.controller;

import ap.users.domain.AiDeveloper;
import ap.users.service.AiDeveloperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final AiDeveloperService aiDeveloperService;
    @PostMapping("/login")
    public String login(@RequestBody AiDeveloper aiDeveloper) {
        return aiDeveloperService.login(aiDeveloper);
    }


}
