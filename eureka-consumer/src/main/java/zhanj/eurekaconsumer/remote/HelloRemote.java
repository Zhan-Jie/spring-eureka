package zhanj.eurekaconsumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-producer")
public interface HelloRemote {

    @GetMapping(value = "/hello")
    String hello(@RequestParam("name") String name);
}