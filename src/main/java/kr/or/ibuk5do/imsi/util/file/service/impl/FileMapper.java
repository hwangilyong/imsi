package kr.or.ibuk5do.imsi.util.file.service.impl;

import kr.or.ibuk5do.imsi.util.file.vo.FileVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("fileMapper")
public interface FileMapper {
    public void addFile(FileVO fileVO) throws Exception;
    public List<FileVO> getFileList(FileVO fileVO) throws Exception;
    public FileVO getFile(FileVO fileVO) throws Exception;
}
