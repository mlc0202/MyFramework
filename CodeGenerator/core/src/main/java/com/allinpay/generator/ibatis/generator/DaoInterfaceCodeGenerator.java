/**
 * Created at 2008-01-23.
 */
package com.allinpay.generator.ibatis.generator;

import java.io.File;
import java.util.Map;

/**
 * @author pony
 *  * 如果有任何对代码的修改,请按下面的格式注明修改的内容. * 序号   时间       作者        修改内容 * 1.  2008-1-23	pony created this class.
 *
 */
public class DaoInterfaceCodeGenerator extends AbstractCodeGenerator {
	public DaoInterfaceCodeGenerator() {
		setTemplateFile("dao-interface.html");
		setModuleFilePath("dao/src/main/java/");
	}
	
	/* (non-Javadoc)
	 * @see com.allinpay.generator.ibatis.generator.AbstractCodeGenerator#createEmptyGeneratedFile(java.lang.String)
	 */
	@Override
	public File createEmptyGeneratedFile(String fileName) {
		String pkgDir = getPackageDir();
		pkgDir = getGeneratedFilePath() + File.separator + getModuleFilePath() + File.separator  + pkgDir;
		new File(pkgDir).mkdirs();
		String filepath = pkgDir + File.separator + "I" + fileName + "Dao.java";
		File file = new File(filepath);
		return file;
	}

	/* (non-Javadoc)
	 * @see com.allinpay.generator.ibatis.generator.AbstractCodeGenerator#getPackageIdentifier()
	 */
	@Override
	public String getPackageIdentifier() {
		return "dao";
	}

	/* (non-Javadoc)
	 * @see com.allinpay.generator.ibatis.ICodeGenerator#getName()
	 */
	public String getName() {
		return "DaoInterfaceGenerator";
	}
	
	/* (non-Javadoc)
	 * @see com.allinpay.generator.ibatis.ICodeGenerator#register(java.util.Map)
	 */
	public void register(Map model) {
		super.register(model);
		model.put("daoInterfacePackage", getRealPackageName());
	}
}
