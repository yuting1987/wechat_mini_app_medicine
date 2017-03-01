package com.api;

import com.dao.ContentDao;
import com.dao.DesDao;
import com.dao.DetailsDao;
import com.output.Content;
import com.output.Detail;
import com.table.Details;
import com.table.Details_Content;
import com.table.Details_Content_Des;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuting on 2017/2/28.
 */

@RestController
@RequestMapping(value = "/api/details")     // 通过这里配置使下面的映射都在/users下，可去除
public class DetailsController {
    @Autowired
    private DetailsDao detailsDao;
    @Autowired
    private ContentDao contentDao;
    @Autowired
    private DesDao desDao;

    @ApiOperation(value = "新增详情", notes = "根据Details对象创建详情")
    @ApiImplicitParam(name = "details", value = "详情的实体对象", required = true, dataType = "Details")
    @RequestMapping(value = "/addDetails", method = RequestMethod.POST)
    public String addDetails(@RequestBody Details details) {
        detailsDao.save(new Details(details.type, details.title, details.des, details.iconUrl, details.imgUrl, details.vendor ,details.date));
        return "success";
    }

    @ApiOperation(value = "获取详情列表", notes = "根据类型获取详情列表")
    @RequestMapping(value = "/queryDetailsByType", method = RequestMethod.GET)
    public List<Details> queryDetailsByType(@ApiParam(name = "type", value = "类型", required = true) @RequestParam String type) {
        return detailsDao.findByType(type);
    }

    @ApiOperation(value = "通过id获得指定信息", notes = "通过id获得Details指定信息")
    @RequestMapping(value = "/getDetailsById", method = RequestMethod.GET)
    public Detail getDetailsById(@ApiParam(name = "id", value = "id", required = true) @RequestParam Long id) {
        Details details = detailsDao.findById(id);
        List<Details_Content> list = contentDao.findByDetailId(details.getId());
        List<Content> contentList = new ArrayList<>();
        List<String> desStrList = new ArrayList<String>();

        for(int i = 0, l = list.size(); i < l; i++) {
            Details_Content d = list.get(i);
            List<Details_Content_Des> desList = desDao.findByContentId(d.getId());

            for (int j = 0 , len = desList.size(); j < len ; j++){
                desStrList.add(desList.get(i).getDes());
            }
            Content c = new Content(d,desStrList);
            contentList.add(c);
        }

        return new Detail(details,contentList);
    }
}
