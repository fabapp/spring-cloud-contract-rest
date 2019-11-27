package springcdcrest.service.client;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureStubRunner(
  stubsMode = StubRunnerProperties.StubsMode.LOCAL,
  ids = "de.fabiankrueger:contract-rest-service:+:stubs:9090")
public class ReverseStringServiceTest {

    @Autowired
    ReverseStringService reverseStringService;

    @Test
    public void given_Fabian_shouldReturn_naibaF()
      throws Exception {

        final String reverseString = reverseStringService.reverseString("Fabian");
        assertThat("naibaF").isEqualTo(reverseString);
    }
}