package kr.or.ibuk5do.imsi.util.file.service.impl;

import kr.or.ibuk5do.imsi.util.file.service.FileService;
import kr.or.ibuk5do.imsi.util.file.vo.FileVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service("fileService")
public class FileServiceImpl implements FileService {
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
    public void generateFileUploader() throws Exception {

    }

    @Override
    public void generateFileDownloader(HttpServletRequest request, HttpServletResponse response) {

    }
}
