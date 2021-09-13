package kr.or.ibuk5do.imsi.util.file.service.impl;

import kr.or.ibuk5do.imsi.util.file.service.FileService;
import kr.or.ibuk5do.imsi.util.file.vo.FileVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
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
    public List<FileVO> getFile(FileVO fileVO) throws Exception {
        return fileMapper.getFile(fileVO);
    }

    @Override
    public String generateFileUploader(MultipartFile uploadFile) throws Exception {
        String fileNm = System.currentTimeMillis() + uploadFile.getOriginalFilename();

        try {
            String saveFile = uploadPath + fileNm;
            uploadFile.transferTo(new File(saveFile));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileNm;
    }

    @Override
    public void generateFileDownloader(HttpServletRequest request, HttpServletResponse response) {

    }
}
