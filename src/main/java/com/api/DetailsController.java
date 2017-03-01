package com.api;

import com.dao.DetailsDao;
import com.input.Detail;
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
    private DetailsDao detailsDao;
//    @Autowired
//    private ContentDao contentRepository;
//    @Autowired
//    private DesDao desRepository;

    @ApiOperation(value = "新增详情", notes = "根据Details对象创建详情")
    @ApiImplicitParam(name = "details", value = "详情的实体对象", required = true, dataType = "Details")
    @RequestMapping(value = "/addDetails", method = RequestMethod.POST)
    public String addDetails(@RequestBody Detail details) {
//        detailsDao.save(new Detail(details.type, details.title, details.des, details.iconUrl, details.imgUrl, details.vendor ,details.date));
        return "success";
    }

//    @ApiOperation(value = "获取详情列表", notes = "根据类型获取详情列表")
//    @RequestMapping(value = "/queryDetailsByType", method = RequestMethod.GET)
//    public List<Detail> queryDetailsByType(@ApiParam(name = "type", value = "类型", required = true) @RequestParam String type) {
//        return detailsRepository.findByType(type);
//    }
//
//    @ApiOperation(value = "通过id获得指定信息", notes = "通过id获得Details指定信息")
//    @RequestMapping(value = "/getDetailsById", method = RequestMethod.GET)
//    public D getDetailsById(@ApiParam(name = "id", value = "id", required = true) @RequestParam Long id) {
//        Detail detail = detailsRepository.findById(id);
//        List<Content> list = contentRepository.findByDetailId(detail.getId());
//
//        //将每个Content 进行 Des 的搜寻 并返回一个Des的数组 进行设置
//        for (Content c : list){
//            List<Des> desList = desRepository.findByContentId(c.getId());
//            c.setDes(desList);
//        }
//
//        return new D(detail,list);
//    }
}
