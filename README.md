# simple_banking_system
<p> Simple Banking System - project from Hyperskill </p>
<p> description of last stage 4/4 </p>
<p>You have created the foundation of our banking system. Now let's take the opportunity to deposit money into an account, make transfers and close an account if necessary.</p>
<p> All data are stored in Data Base </p>
<p>Now your menu should look like this:</p>

<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>

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

<p>If the user chooses the <b>Close an account</b> item, you should delete that account from the database.</p>

<p><b>Examples</b></p>
<p>Example 1:</p>
<code>1. Create an account</code><br>
<code>2. Log into account</code><br>
<code>0. Exit</code><br>
<code>>1</code><br>
<code></code><br>
<code>Your card has been created</code><br>
<code>Your card number:</code><br>
<code>4000009455296122</code><br>
<code>Your card PIN:</code><br>
<code>1961</code><br>
<code></code><br>
<code>1. Create an account</code><br>
<code>2. Log into account</code><br>
<code>0. Exit</code><br>
<code>>1</code><br>
<code></code><br>
<code>Your card has been created</code><br>
<code>Your card number:</code><br>
<code>4000003305160034</code><br>
<code>Your card PIN:</code><br>
<code>5639</code><br>
<code></code><br>
<code>1. Create an account</code><br>
<code>2. Log into account</code><br>
<code>0. Exit</code><br>
<code>>2</code><br>
<code></code><br>
<code>Enter your card number:</code><br>
<code>>4000009455296122</code><br>
<code>Enter your PIN:</code><br>
<code>>1961</code><br>
<code></code><br>
<code>You have successfully logged in!</code><br>
<code></code><br>
<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>
<code>>2</code><br>
<code></code><br>
<code>Enter income:</code><br>
<code>>10000</code><br>
<code>Income was added!</code><br>
<code></code><br>
<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>
<code>>1</code><br>
<code></code><br>
<code>Balance: 10000</code><br>
<code></code><br>
<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>
<code>>3</code><br>
<code></code><br>
<code>Transfer</code><br>
<code>Enter card number:</code><br>
<code>>4000003305160035</code><br>
<code>Probably you made mistake in the card number. Please try again!</code><br>
<code></code><br>
<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>
<code>>3</code><br>
<code></code><br>
<code>Transfer</code><br>
<code>Enter card number:</code><br>
<code>>4000003305061034</code><br>
<code>Such a card does not exist.</code><br>
<code></code><br>
<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>
<code>>3</code><br>
<code></code><br>
<code>Transfer</code><br>
<code>Enter card number:</code><br>
<code>>4000003305160034</code><br>
<code>Enter how much money you want to transfer:</code><br>
<code>>15000</code><br>
<code>Not enough money!</code><br>
<code></code><br>
<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>
<code>>3</code><br>
<code></code><br>
<code>Transfer</code><br>
<code>Enter card number:</code><br>
<code>>4000003305160034</code><br>
<code>Enter how much money you want to transfer:</code><br>
<code>>5000</code><br>
<code>Success!</code><br>
<code></code><br>
<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>
<code>>1</code><br>
<code></code><br>
<code>Balance: 5000</code><br>
<code></code><br>
<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>
<code></code><br>
<code>>0</code><br>
<code>Bye!</code><br>
<br>
<p>Example 2:</p>
<code>1. Create an account</code><br>
<code>2. Log into account</code><br>
<code>0. Exit</code><br>
<code>>1</code><br>
<code></code><br>
<code>Your card has been created</code><br>
<code>Your card number:</code><br>
<code>4000007916053702</code><br>
<code>Your card PIN:</code><br>
<code>6263</code><br>
<code></code><br>
<code>1. Create an account</code><br>
<code>2. Log into account</code><br>
<code>0. Exit</code><br>
<code>>2</code><br>
<code></code><br>
<code>Enter your card number:</code><br>
<code>>4000007916053702</code><br>
<code>Enter your PIN:</code><br>
<code>>6263</code><br>
<code></code><br>
<code>You have successfully logged in!</code><br>
<code></code><br>
<code>1. Balance</code><br>
<code>2. Add income</code><br>
<code>3. Do transfer</code><br>
<code>4. Close account</code><br>
<code>5. Log out</code><br>
<code>0. Exit</code><br>
<code>>4</code><br>
<code></code><br>
<code>The account has been closed!</code><br>
<code></code><br>
<code>1. Create an account</code><br>
<code>2. Log into account</code><br>
<code>0. Exit</code><br>
<code>>2</code><br>
<code></code><br>
<code>Enter your card number:</code><br>
<code>>4000007916053702</code><br>
<code>Enter your PIN:</code><br>
<code>>6263</code><br>
<code></code><br>
<code>Wrong card number or PIN!</code><br>
<code></code><br>
<code>1. Create an account</code><br>
<code>2. Log into account</code><br>
<code>0. Exit</code><br>
<code>>0</code><br>
<code></code><br>
<code>Bye!</code><br>



