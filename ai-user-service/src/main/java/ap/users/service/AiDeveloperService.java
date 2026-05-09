package ap.users.service;

import ap.users.domain.AiDeveloper;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 25473
* @description 针对表【ai_developer(开发者用户表)】的数据库操作Service
* @createDate 2026-05-10 09:26:49
*/
public interface AiDeveloperService extends IService<AiDeveloper> {

    String login(AiDeveloper aiDeveloper);
}
