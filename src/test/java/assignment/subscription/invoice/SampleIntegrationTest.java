package assignment.subscription.invoice;

import assignment.subscription.Subscription;
import assignment.subscription.SubscriptionRepository;
import assignment.subscription.SubscriptionResource;
import assignment.subscription.SubscriptionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class SampleIntegrationTest {

    private MockMvc mockMvc;

    @Mock
    private SubscriptionService subscriptionService;

    @InjectMocks
    private SubscriptionResource subscriptionResource;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(subscriptionResource).build();
    }

    @Test
    public void testGetCarList() throws Exception {
        Subscription subscription = new Subscription();
        // set the subscription values


        Mockito.when(subscriptionService.getSubscription(Matchers.anyLong())).thenReturn(subscription);

        MvcResult result = mockMvc.perform(post("/subscriptions")
                .accept("application/json"))
                .andExpect(status().isOk())
                .andReturn();

        Mockito.verify(subscriptionService).getSubscription(1L);

        ObjectMapper objectMapper = new ObjectMapper();

        assertEquals(objectMapper.writeValueAsString("success"), result.getResponse().getContentAsString());
    }
}
