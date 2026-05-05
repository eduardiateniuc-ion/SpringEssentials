package rewards.internal.account;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.repository.Repository;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.Id;

/**
 * Loads account aggregates. Called by the reward network to find and
 * reconstitute Account entities from an external form such as a set of RDMS
 * rows.
 *
 * Objects returned by this repository are guaranteed to be fully initialized
 * and ready to use.
 */
//  TODO-03: Alter this interface to extend a proper Spring Data interface.
//  - The finder method on this class must be changed to obey Spring Data
//    conventions - use refactoring feature of the IDE
public interface AccountRepository extends Repository<Account, Long> {

	/**
	 * Load an account by its credit card.
	 *
	 * @param creditCardNumber
	 *            the credit card number
	 * @return the account object
	 */
	public Account findByCreditCardNumber(String creditCardNumber);
}