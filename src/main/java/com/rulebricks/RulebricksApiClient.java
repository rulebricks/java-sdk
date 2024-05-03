/**
 * This file was auto-generated by Fern from our API Definition.
 */

import core.ClientOptions;
import core.Suppliers;
import java.util.function.Supplier;
import resources.flows.FlowsClient;
import resources.rules.RulesClient;

public class RulebricksApiClient {
  protected final ClientOptions clientOptions;

  protected final Supplier<RulesClient> rulesClient;

  protected final Supplier<FlowsClient> flowsClient;

  public RulebricksApiClient(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
    this.rulesClient = Suppliers.memoize(() -> new RulesClient(clientOptions));
    this.flowsClient = Suppliers.memoize(() -> new FlowsClient(clientOptions));
  }

  public RulesClient rules() {
    return this.rulesClient.get();
  }

  public FlowsClient flows() {
    return this.flowsClient.get();
  }

  public static RulebricksApiClientBuilder builder() {
    return new RulebricksApiClientBuilder();
  }
}
