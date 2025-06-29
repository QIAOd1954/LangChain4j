package com.itheima.consultant.aiservice;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;
import reactor.core.publisher.Flux;

@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT,//手动装配
        chatModel = "openAiChatModel", //指定模型
        streamingChatModel = "openAiStreamingChatModel"
)
//@AiService
public interface ConsultantService {
    //用于聊天的方法
//    public String chat(String message);
    //@SystemMessage("你是东哥助手小月月，人美心善！")
    @SystemMessage(fromResource = "system.txt")
    //@UserMessage("你是东哥助手小月月，人美心善！{{it}}")
    //@UserMessage("你是东哥助手小月月，人美心善！{{msg}}")
    public Flux<String> chat(@V("msg") String message);
}
