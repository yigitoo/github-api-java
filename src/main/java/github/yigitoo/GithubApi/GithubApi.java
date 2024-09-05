package github.yigitoo.GithubApi;

import org.kohsuke.github.*;

import java.io.IOException;

public class GithubApi {
    static GitHub github;

    public static void main(String[] args) throws IOException {
        GithubApi.connect();
    }

    public static void  connect() throws IOException {
        github = GitHub.connect("yigitoo", "TOKEN");
        if (github.isCredentialValid()) {
            System.out.println("Daddy is home baby!");
        } else {
            System.out.println("Cannot logged in your github account.");
        }
    }
}