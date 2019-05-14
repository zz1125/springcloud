
package com.jk.service;

import com.jk.util.HiError;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(value = "service-hi",fallback =HiError.class)
public interface HelloService extends HelloServiceApi {


}
