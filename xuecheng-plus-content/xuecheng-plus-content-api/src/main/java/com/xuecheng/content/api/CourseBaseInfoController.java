package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CourseBaseInfoController {

    @RequestMapping("/course/list")
    public PageResult<QueryCourseParamsDto> list(PageParams pageParams, @RequestBody(required=false) QueryCourseParamsDto queryCourseParamsDto){

        log.info(pageParams.toString());
        log.info(queryCourseParamsDto.toString());

        return null;
    }

}
