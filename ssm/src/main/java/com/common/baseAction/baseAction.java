package com.common.baseAction;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

public class baseAction {

	protected void write(HttpServletResponse response, String html) {
		response.setContentType("text/html; charset=UTF-8");
		try {
			response.getWriter().print(html);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void writeJSON(HttpServletResponse response, Object object) {
		response.setContentType("text/html; charset=UTF-8");
		
		  JsonConfig jsonConfig = new JsonConfig();
          jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);// 可防止hibernate模式下的关联关系子对象中包含父对象造成死循环
          JSONArray jsonArray = JSONArray.fromObject(object, jsonConfig);
          write(response, jsonArray.toString());
	}

}
