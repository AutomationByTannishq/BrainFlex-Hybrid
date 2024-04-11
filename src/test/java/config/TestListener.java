//TestListener.java

package config;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

//    @Override
//
//    public void onTestFailure(ITestResult result) {
//
//        boolean islogIssue = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraCreateIssue.class).isCreateIssue();
//
//        if (islogIssue) {
//
//            JiraServiceProvider JiraServiceProvider = new JiraServiceProvider("https://jkvsolutions.atlassian.net/", "tsoni@jkvsolutions.com", "ATATT3xFfGF0gCecNooGenDD1GZ5MksHXFFYk8cLuN8vnJQar_c0Ca0ATxolDDj6SEit3TR5T2Jxz-xfb3H0ict6lNC8PrW1mhxPE-0iGWAi-24s8cR6t_jSoBa-h7Jvc5kapzybLBdMV75KoCxBBmLHA6mfXrrBJvXlpEdEKA89hteiNLfv5yo=1132CE99", "BF3");
//
//            String issueDescription = "Failure Reason from Automation Testing\n\n" + result.getThrowable().getMessage() + "\n";
//
//            issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
//
//            String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName() + " Failed in Automation Testing";
//
//            JiraServiceProvider.createJiraIssue("Bug", issueSummary, issueDescription, "Tanishq Soni", "Jay G Patel\n", "High");
//
//        }
//
//    }

}
