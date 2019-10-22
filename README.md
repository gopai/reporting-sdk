# reporting-sdk

This repository holds the reporting SDK that contains our implementation of our Report and Data API Client. This client allows a user to interact with PAI's paireports.com in several ways.

The reporting-sdk provides mechanisms for filtering, sorting, and adjusting the number of columns produced in response to your requests to make it easier for your applications to work.

One of the easiest ways to retrieve data is through the Report API. This API is designed around a standard HTTP request process and will allow access to any data that a user can access through the screens provided within PAI Reports. Using this SDK, you can develop applications that utilize the huge amount of data that PAI Reports collects and stores to build new data integrations.

This API is based on standard HTTP practices and primarily uses key-value pairs for passing filters, sort orders, and report selections. 

The [Wiki](https://github.com/gopai/reporting-sdk/wiki) describes the available commands.

The SDK is available on Maven Central [reporting-sdk](https://search.maven.org/artifact/com.gopai/reporting-sdk)
