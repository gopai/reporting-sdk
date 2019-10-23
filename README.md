# reporting-sdk
The Reporting SDK contains our implementation of a client which gives access to our Report and Data API. This gives users a solid access point for interacting with [PAI Reports](https://www.paireports.com/myreports/GetLogin.event) and the report data available to the user.

The API is designed around a standard HTTP request process and will allow access to any data that a user can access through the screens provided within PAI Reports. Using this SDK, you can develop applications that utilize the large amount of data that PAI Reports possesses to build new data integrations.

## Usage
The PAIClient class is used to substantiate a session to PAI Reports and provides mechanisms for running reports and queries.

The ReportRequest class allows for filtering, sorting, and adjusting the number of columns in your requests to make it easier for your applications to digest the response data.

The ReportConfig class allows you to see the columns, types, format, and acceptable values of a given report to allow you to properly construct your filters.

The StreamUtil class is a simple support class to convert the output data into a desired form.

### Available commands
The [Wiki](https://github.com/gopai/reporting-sdk/wiki) describes the available commands and the Report API Documentation.

## Installation
The reporting-sdk is available on the Maven Central Repository, [reporting-sdk](https://search.maven.org/artifact/com.gopai/reporting-sdk). Importing from maven will depend on the build for the project.
reporting-sdk can also be downloaded directly from Github as source, compiled, and included as a library.

## License
reporting-sdk is published under the [MIT license](https://github.com/gopai/reporting-sdk/blob/master/LICENSE).
