package rewards;

/**
 * Rewards a member account for dining at a restaurant.
 * 
 * A reward takes the form of a monetary contribution made to an account that is distributed among the account's
 * beneficiaries. The contribution amount is typically a function of several factors such as the dining amount and
 * restaurant where the dining occurred.
 * 
 * Example: Papa Keith spends $100.00 at Apple Bee's resulting in a $8.00 contribution to his account that is
 * distributed evenly among his beneficiaries Annabelle and Corgan.
 * 
 * This is the central application-boundary for the "rewards" application. This is the public interface users call to
 * invoke the application. This is the entry-point into the Application Layer.
 */
public interface RewardNetwork {


	public RewardConfirmation rewardAccountFor(Dining dining);
}