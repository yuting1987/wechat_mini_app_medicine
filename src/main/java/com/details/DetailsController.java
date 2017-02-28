package com.details;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuting on 2017/2/28.
 */

@RestController
@RequestMapping(value = "/api/details")     // 通过这里配置使下面的映射都在/users下，可去除
public class DetailsController {
    @Autowired
    private DetailsRepository detailsRepository;

    @ApiOperation(value = "新增详情", notes = "根据Details对象创建详情")
    @ApiImplicitParam(name = "details", value = "详情的实体对象", required = true, dataType = "Details")
    @RequestMapping(value = "/addDetails", method = RequestMethod.POST)
    public String addDetails(@RequestBody Details details) {
        return "success";
    }
}
