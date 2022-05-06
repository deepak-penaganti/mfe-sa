package dev.deepakpenaganti.ssp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DataMongoTest(
  excludeAutoConfiguration = org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration.class
)
@ExtendWith(SpringExtension.class)
class SelfServicePortalApplicationTests {

	@Test
	void contextLoads() {
	}

}
