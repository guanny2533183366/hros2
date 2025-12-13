package com.liruilong.hros.service.utils;

import com.liruilong.hros.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @Description :

 *
 */
public class Hruitls {
    public static Hr getCurrent(){
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    }
}
