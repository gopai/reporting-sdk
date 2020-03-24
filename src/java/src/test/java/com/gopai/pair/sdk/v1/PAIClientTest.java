package com.gopai.pair.sdk.v1;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PAIClientTest {

    public static String USER_NAME = System.getenv("pai-test-user-name");
    public static String PASSWORD = System.getenv("pai-test-password");

    @Test
    public void queryTest() throws IOException {
        System.out.println(USER_NAME);
        PAIClient paiClient = new PAIClient();
        paiClient.connect(USER_NAME, PASSWORD);
        InputStream stream = paiClient.runQuery("SELECT TOP 1 r.ReportGUID, r.ExternalName FROM ReportConfigs r WHERE r.ExternalName = 'softwarepackages'");
        BufferedReader input = new BufferedReader(new InputStreamReader(stream));
        String consoleInput;

        while ((consoleInput = input.readLine()) != null)
            System.out.println(consoleInput);
        input.close();
    }

    @Test
    public void reportTest() throws IOException {
        PAIClient paiClient = new PAIClient();
        paiClient.connect(USER_NAME, PASSWORD);
        InputStream stream = paiClient.retrieveReportUsingGUID("403ABED1-0C6E-EA11-80E1-A0369F89ECE2");
        BufferedReader input = new BufferedReader(new InputStreamReader(stream));
        String consoleInput;

        while ((consoleInput = input.readLine()) != null)
            System.out.println(consoleInput);
        input.close();
    }

    @Test
    public void noCredentialsIsConnectedTest() {
        PAIClient paiClient = new PAIClient();
        assertThat(paiClient.isConnected(), is(false));
    }

    @Test
    public void badCredentialsIsConnectedTest() throws IOException {
        PAIClient paiClient = new PAIClient();
        paiClient.connect("BadUserName", "BadPassword");
        assertThat(paiClient.isConnected(), is(false));
    }
}