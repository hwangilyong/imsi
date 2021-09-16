package kr.or.ibuk5do.imsi.util.file.service.impl;

import kr.or.ibuk5do.imsi.util.file.service.FileService;
import kr.or.ibuk5do.imsi.util.file.vo.FileVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLEncoder;
import java.nio.file.Path;
import java.util.List;

@Service("fileService")
public class FileServiceImpl implements FileService {
    private static String uploadPath = "d:\\upload\\";

    @Resource(name = "fileMapper")
    private FileMapper fileMapper;

    @Override
    public void addFile(FileVO fileVO) throws Exception {
        fileMapper.addFile(fileVO);
    }

    @Override
    public List<FileVO> getFileList(FileVO fileVO) throws Exception {
        return fileMapper.getFileList(fileVO);
    }

    @Override
    public FileVO getFile(FileVO fileVO) throws Exception {
        return fileMapper.getFile(fileVO);
    }



    @Override
    public String generateFileUploader(MultipartFile uploadFile) throws Exception {
        String fileNm = System.currentTimeMillis() + uploadFile.getOriginalFilename();

        try {
            String saveFile = uploadPath + fileNm;
            FileOutputStream writer = new FileOutputStream(saveFile);
            writer.write(uploadFile.getBytes());
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileNm;
    }

    @Override
    public void generateFileDownloader(HttpServletRequest request, HttpServletResponse response, String fileName) {
        /*response.reset();
        //response.setContentType("application/x-msdownload; charset=UTF-8");
        response.setHeader("Content-Type", "application/octet-stream; charset=UTF-8");
        if (downloadSize > 0L && downloadSize < Long.MAX_VALUE) {
            //response.setContentLength((int)downloadSize);
            response.setHeader("Content-Length", String.valueOf(downloadSize));
        }
        response.setHeader("Accept-Ranges", "bytes");

        // 웹브라우저 및 WAS유형에 따라 컨텐츠명 인코딩을 다르게 처리
        if (ViewUtils.getClientAgent(request) == ClientAgent.MSIE) {
            response.setHeader("Content-Type", "application/x-msdownload; charset=UTF-8");
            // MSIE일 경우 처리
            downloadName = URLEncoder.encode(downloadName, "UTF-8").replaceAll("\\+", "%20");
        } else {
            // Firefox, chrome등 비MSIE 처리
            if (DeployTargetWas.JBOSS.equals(ViewUtils.deployTargetWas)) {
                downloadName = new String(downloadName.getBytes("UTF-8"), "UTF-8");
            } else if (DeployTargetWas.TOMCAT.equals(ViewUtils.deployTargetWas)) {
                downloadName = new String(downloadName.getBytes("UTF-8"), "iso-8859-1");
            } else {
                downloadName = new String(downloadName.getBytes("UTF-8"), "iso-8859-1");
            }
        }

        response.setHeader("Content-Disposition", "attachment;filename=\"" + downloadName + "\";");
        response.setHeader("Content-Transfer-Encoding", "binary");
        response.setHeader("Cache-Control", "no-store,max-age=0,must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "-1");

        ServletOutputStream out = response.getOutputStream();
        workbook.write(out);
        out.flush();
        out.close();*/
    }

//    public static ClientAgent getClientAgent(HttpServletRequest request) {
//        String userAgent = request.getHeader("User-Agent");
//        ClientAgent ret = null;
//
//        if (userAgent.indexOf("MSIE") > -1) {
//            // MSIE일 경우 처리
//            ret = ClientAgent.MSIE;
//        } else if (userAgent.indexOf("Firefox") > -1) {
//            // Firefox
//            ret = ClientAgent.Firefox;
//        } else if (userAgent.indexOf("Chrome") > -1) {
//            // Chrome
//            ret = ClientAgent.Chrome;
//        } else {
//            ret = ClientAgent.MSIE;
//        }
//
//        return ret;
//    }
}
