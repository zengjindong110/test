package com.xuechengplus.content.api;

import com.xuecheng.PageParams;
import com.xuecheng.PageResult;
import com.xuecheng.dto.QueryCourseParamsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CourseBaseInfoController {

    @RequestMapping("/course/list")
    public PageResult<QueryCourseParamsDto> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParamsDto){

        log.info(pageParams.toString());
        log.info(queryCourseParamsDto.toString());

        return null;
    }

}
