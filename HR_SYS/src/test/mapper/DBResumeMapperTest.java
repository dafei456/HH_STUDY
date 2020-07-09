package test.mapper;

import main.dto.Result;
import main.dto.ResumeList;
import main.entity.Resume;
import main.enums.ProcessEnum;
import main.mapper.DBResumeMapper;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 7/9/20 2:58 PM
 */
public class DBResumeMapperTest {

  public static void main(String[] args) {
    listResumeTest();
    getResumeByIDTest();
  }

  public static void listResumeTest() {
    Result result = new DBResumeMapper().listResume();
    ResumeList resumes = (ResumeList) result.getData();
    resumes.forEach(System.out::println);
  }

  public static void getResumeByIDTest() {
    Result result = new DBResumeMapper().getResumeByID(new Resume("", "510966199603017563", "", ProcessEnum.EMPLOYED,
            false));
    Resume resume = (Resume) result.getData();
    System.out.println(resume.toString());
  }
}