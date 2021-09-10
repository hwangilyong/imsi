package kr.or.ibuk5do.imsi.util.file.service;

import kr.or.ibuk5do.imsi.util.file.vo.FileVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface FileService {
    public void addFile(FileVO fileVO) throws Exception;
    public List<FileVO> getFile(FileVO fileVO) throws Exception;
    public void generateFileUploader() throws Exception;
    public void generateFileDownloader(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
