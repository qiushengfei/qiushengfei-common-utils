package com.qiushengfei.common.utils.test;

import java.util.List;

import org.junit.Test;

import com.qiushengfei.common.utils.FileUtil;
import com.qiushengfei.common.utils.RandomUtil;
import com.qiushengfei.common.utils.StringUtil;

public class FileTests {
	
	@Test
	public void show1_3() {
		
		String str="aaa";
		boolean null1 = StringUtil.isNull(str);
		System.out.println("判断字符串是否为空"+null1);
		boolean email = StringUtil.isEmail(str);
		System.out.println("判断是否为邮箱"+email);
		String fileName = "C:\\Users\\QSF\\Desktop\\aa.txt";
		List<String> readTextFileToList = FileUtil.readTextFileToList(fileName);
		System.out.println("读入文件到集合里"+readTextFileToList);
		int random = RandomUtil.random(1, 120);
		System.out.println("返回某个时间段的数据"+random);
		int[] random2 = RandomUtil.random(0,9,4);
		System.out.println("获取随机数为");
		for (int i : random2) {
			System.out.print(i);
		}
		
	}
	
	
}
