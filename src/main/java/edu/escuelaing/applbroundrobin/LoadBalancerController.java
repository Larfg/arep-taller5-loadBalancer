package edu.escuelaing.applbroundrobin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Random;

@RestController
public class LoadBalancerController {

    String server = "35.172.220.219";
    String puerto1 = "34000";
    String puerto2 = "34001";
    String puerto3 = "34002";
    Random random = new Random();

    @GetMapping("/get")
    public String get() {
        URI uri;
        int sel = random.nextInt(3);
        if (sel == 0){
            uri = URI.create(String.format("http://%s:%s/logs", server, puerto1));
        }
        if (sel == 1){
            uri = URI.create(String.format("http://%s:%s/logs", server, puerto2));
        }
        else{
            uri = URI.create(String.format("http://%s:%s/logs", server, puerto3));
        }
        return new RestTemplate().getForObject(uri, String.class);
    }

    @PostMapping("/post")
    public String post(@RequestBody String log) {
        URI uri;
        int sel = random.nextInt(3);
        if (sel == 0){
            uri = URI.create(String.format("http://%s:%s/logs", server, puerto1));
        }
        if (sel == 1){
            uri = URI.create(String.format("http://%s:%s/logs", server, puerto2));
        }
        else{
            uri = URI.create(String.format("http://%s:%s/logs", server, puerto3));
        }
        return new RestTemplate().postForObject(uri, log, String.class);
    }

}
