package ap.users.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ap.users.domain.AiDeveloper;
import ap.users.service.AiDeveloperService;
import ap.users.mapper.AiDeveloperMapper;
import org.springframework.stereotype.Service;

/**
* @author 25473
* @description 针对表【ai_developer(开发者用户表)】的数据库操作Service实现
* @createDate 2026-05-10 09:26:49
*/
@Service
public class AiDeveloperServiceImpl extends ServiceImpl<AiDeveloperMapper, AiDeveloper> implements AiDeveloperService{

    @Override
    public String login(AiDeveloper aiDeveloper) {
        return "";
    }
}




