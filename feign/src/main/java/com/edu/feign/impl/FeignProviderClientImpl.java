package com.edu.feign.impl;

import com.edu.entity.Student;
import com.edu.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignProviderClientImpl implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。static为500，";
    }
}
