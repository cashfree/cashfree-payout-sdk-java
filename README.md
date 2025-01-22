# Cashfree Payout Java SDK
![GitHub](https://img.shields.io/github/license/cashfree/cashfree-payout-sdk-java) ![Discord](https://img.shields.io/discord/931125665669972018?label=discord) ![GitHub last commit (branch)](https://img.shields.io/github/last-commit/cashfree/cashfree-payout-sdk-java/main) ![GitHub release (with filter)](https://img.shields.io/github/v/release/cashfree/cashfree-payout-sdk-java?label=latest) ![GitHub forks](https://img.shields.io/github/forks/cashfree/cashfree-payout-sdk-java) [![Coverage Status](https://coveralls.io/repos/github/cashfree/cashfree-payout-sdk-java/badge.svg?branch=main)](https://coveralls.io/github/cashfree/cashfree-payout-sdk-java?branch=main)

The Cashfree Payout Java SDK offers a convenient solution to access [Cashfree Payout APIs](https://docs.cashfree.com/reference/version-2) from a server-side Java  applications.



## Documentation

Cashfree's Payout API Documentation -https://docs.cashfree.com/reference/version-2

Learn and understand payment gateway workflows at Cashfree Payouts [here](https://docs.cashfree.com/docs/payouts)

Try out our interactive guides at [Cashfree Dev Studio](https://www.cashfree.com/devstudio) !

## Getting Started

### Installation
* Gradle Project
```bash
implementation `com.cashfree.payout.java:cashfree_payout:2.0.1`
```
* Maven Project
```bash
<dependency>
  <groupId>com.cashfree.payout.java</groupId>
  <artifactId>cashfree_payout</artifactId>
  <version>2.0.1</version>
  <scope>compile</scope>
</dependency>
<dependency>
    <groupId>com.squareup.okhttp3</groupId>
    <artifactId>okhttp</artifactId>
    <version>4.10.0</version>
</dependency>
```
### Configuration

```java 
import com.cashfree.*;

CashfreePayout.XClientId = "<x-client-id>";
CashfreePayout.XClientSecret = "<x-client-secret>";
CashfreePayout.XEnvironment = CashfreePayout.SANDBOX;

CashfreePayout cashfree = new CashfreePayout();
String xApiVersion = "2024-01-01";
```

Generate your API keys (x-client-id , x-client-secret) from [Cashfree Merchant Dashboard](https://merchant.cashfree.com/merchants/login)



## Licence

Apache Licensed. See [LICENSE.md](LICENSE.md) for more details
