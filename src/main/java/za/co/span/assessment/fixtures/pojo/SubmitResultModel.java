package za.co.span.assessment.fixtures.pojo;

import org.springframework.stereotype.Component;

@Component
public class SubmitResultModel {
//    private LoginModel loginModel;
    private ResultModel resultModel;

//    public LoginModel getLoginModel() {
//        return loginModel;
//    }
//
//    public void setLoginModel(LoginModel loginModel) {
//        this.loginModel = loginModel;
//    }

    public ResultModel getResultModel() {
        return resultModel;
    }

    public void setResultModel(ResultModel resultModel) {
        this.resultModel = resultModel;
    }
}
