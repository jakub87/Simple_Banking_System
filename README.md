# simple_banking_system
<p> Simple Banking System - project from Hyperskill </p>
<p> description of last stage 4/4 </p>
<p>You have created the foundation of our banking system. Now let's take the opportunity to deposit money into an account, make transfers and close an account if necessary.</p>
<p> All data are stored in Data Base </p>
<p>Now your menu should look like this:</p>

<code>1. Balance</code>
<code>2. Add income</code>
<code>3. Do transfer</code>
<code>4. Close account</code>
<code>5. Log out</code>
<code>0. Exit</code>

<p>If the user asks for <b>Balance</b>, you should read the balance of the account from the database and output it into the console.</p>

<p><b>Add income</b> item should allow us to deposit money to the account.</p>

<p><b>Do transfer</b> item should allow transferring money to another account. You should handle the following errors:</p>
<ul>
<li>If the user tries to transfer more money than he/she has, output: "Not enough money!"</li>
<li>If the user tries to transfer money to the same account, output the following message: “You can't transfer money to the same account!”</li>
<li>If the receiver's card number doesn’t pass the Luhn algorithm, you should output: “Probably you made mistake in the card number. Please try again!”</li>
<li>If the receiver's card number doesn’t exist, you should output: “Such a card does not exist.”</li>
<li>If there is no error, ask the user how much money they want to transfer and make the transaction.</li>


</ul>

<p>If the user chooses the <b>Close an account<b> item, you should delete that account from the database.</p>

<p><b>Examples</b></p>
<p>Example 1:</p>
<code>1. Create an account</code>
<code>2. Log into account</code>
<code>0. Exit</code>
<code>>1</code>
<code></code>
<code>Your card has been created</code>
<code>Your card number:</code>
<code>4000009455296122</code>
<code>Your card PIN:</code>
<code>1961</code>
<code></code>
<code>1. Create an account</code>
<code>2. Log into account</code>
<code>0. Exit</code>
<code>>1</code>
<code></code>
<code>Your card has been created</code>
<code>Your card number:</code>
<code>4000003305160034</code>
<code>Your card PIN:</code>
<code>5639</code>
<code></code>
<code>1. Create an account</code>
<code>2. Log into account</code>
<code>0. Exit</code>
<code>>2</code>
<code></code>
<code>Enter your card number:</code>
<code>>4000009455296122</code>
<code>Enter your PIN:</code>
<code>>1961</code>
<code></code>
<code>You have successfully logged in!</code>
<code></code>
<code>1. Balance</code>
<code>2. Add income</code>
<code>3. Do transfer</code>
<code>4. Close account</code>
<code>5. Log out</code>
<code>0. Exit</code>
<code>>2</code>
<code></code>
<code>Enter income:</code>
<code>>10000</code>
<code>Income was added!</code>
<code></code>
<code>1. Balance</code>
<code>2. Add income</code>
<code>3. Do transfer</code>
<code>4. Close account</code>
<code>5. Log out</code>
<code>0. Exit</code>
<code>>1</code>
<code></code>
<code>Balance: 10000</code>
<code></code>
<code>1. Balance</code>
<code>2. Add income</code>
<code>3. Do transfer</code>
<code>4. Close account</code>
<code>5. Log out</code>
<code>0. Exit</code>
<code>>3</code>
<code></code>
<code>Transfer</code>
<code>Enter card number:</code>
<code>>4000003305160035</code>
<code>Probably you made mistake in the card number. Please try again!</code>
<code></code>
<code>1. Balance</code>
<code>2. Add income</code>
<code>3. Do transfer</code>
<code>4. Close account</code>
<code>5. Log out</code>
<code>0. Exit</code>
<code>>3</code>
<code></code>
<code>Transfer</code>
<code>Enter card number:</code>
<code>>4000003305061034</code>
<code>Such a card does not exist.</code>
<code></code>
<code>1. Balance</code>
<code>2. Add income</code>
<code>3. Do transfer</code>
<code>4. Close account</code>
<code>5. Log out</code>
<code>0. Exit</code>
<code>>3</code>
<code></code>
<code>Transfer</code>
<code>Enter card number:</code>
<code>>4000003305160034</code>
<code>Enter how much money you want to transfer:</code>
<code>>15000</code>
<code>Not enough money!</code>
<code></code>
<code>1. Balance</code>
<code>2. Add income</code>
<code>3. Do transfer</code>
<code>4. Close account</code>
<code>5. Log out</code>
<code>0. Exit</code>
<code>>3</code>
<code></code>
<code>Transfer</code>
<code>Enter card number:</code>
<code>>4000003305160034</code>
<code>Enter how much money you want to transfer:</code>
<code>>5000</code>
<code>Success!</code>
<code></code>
<code>1. Balance</code>
<code>2. Add income</code>
<code>3. Do transfer</code>
<code>4. Close account</code>
<code>5. Log out</code>
<code>0. Exit</code>
<code>>1</code>
<code></code>
<code>Balance: 5000</code>
<code></code>
<code>1. Balance</code>
<code>2. Add income</code>
<code>3. Do transfer</code>
<code>4. Close account</code>
<code>5. Log out</code>
<code>0. Exit</code>
<code></code>
<code>>0</code>
<code>Bye!</code>











