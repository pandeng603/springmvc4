package com.pand.highlight_springmvc4.web.ch4_5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public String upload(MultipartFile file) {
		try {
			FileUtils.writeByteArrayToFile(new File("d:/upload/"+file.getOriginalFilename()), file.getBytes());
			return "OK";
		} catch (IOException e) {
			e.printStackTrace();
			return "wrong";
		}
	}
}
