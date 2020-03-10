$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Assetdetails.feature");
formatter.feature({
  "line": 1,
  "name": "Asset detail features",
  "description": "",
  "id": "asset-detail-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validating the dropdown values",
  "description": "",
  "id": "asset-detail-features;validating-the-dropdown-values",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "the user is in Asset details screen",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the user selects values from the dropdowns",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the user should be able to see the result based on the selection of values",
  "keyword": "Then "
});
formatter.match({
  "location": "assetdetails.the_user_is_in_Asset_details_screen()"
});
formatter.result({
  "duration": 9408220219,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_selects_values_from_the_dropdowns()"
});
formatter.result({
  "duration": 13440358497,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_should_be_able_to_see_the_result_based_on_the_selection_of_values()"
});
formatter.result({
  "duration": 8552722026,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validating the master assets",
  "description": "",
  "id": "asset-detail-features;validating-the-master-assets",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the user is in Asset details page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user selects master option from the dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user should be able to see all the master assets which is linked and not linked to product badges",
  "keyword": "Then "
});
formatter.match({
  "location": "assetdetails.the_user_is_in_Asset_details_page()"
});
formatter.result({
  "duration": 3451438278,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_selects_master_option_from_the_dropdown()"
});
formatter.result({
  "duration": 10239387689,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_should_be_able_to_see_all_the_master_assets_which_is_linked_and_not_linked_to_product_badges()"
});
formatter.result({
  "duration": 9319523555,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validating the loader",
  "description": "",
  "id": "asset-detail-features;validating-the-loader",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "the user is in Asset details page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user selects values from the dropdowns and clicks on view button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user should be able to see the loader",
  "keyword": "Then "
});
formatter.match({
  "location": "assetdetails.the_user_is_in_Asset_details_page()"
});
formatter.result({
  "duration": 3088836567,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_selects_values_from_the_dropdowns_and_clicks_on_view_button()"
});
formatter.result({
  "duration": 13492402236,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.user_should_be_able_to_see_the_loader()"
});
formatter.result({
  "duration": 3040990315,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validating the valid search functionality",
  "description": "",
  "id": "asset-detail-features;validating-the-valid-search-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "the user is in Asset details page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "the user selects values from the dropdowns and clicks on view button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the user search for any asset",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the user should be able to get the result based on the search",
  "keyword": "Then "
});
formatter.match({
  "location": "assetdetails.the_user_is_in_Asset_details_page()"
});
formatter.result({
  "duration": 3755453602,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_selects_values_from_the_dropdowns_and_clicks_on_view_button()"
});
formatter.result({
  "duration": 13545934242,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_search_for_any_asset()"
});
formatter.result({
  "duration": 8965346209,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_should_be_able_to_get_the_result_based_on_the_search()"
});
formatter.result({
  "duration": 16702,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Validating the invalid search functioanlity",
  "description": "",
  "id": "asset-detail-features;validating-the-invalid-search-functioanlity",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "the user is in Asset details page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "the user selects values from the dropdowns and clicks on view button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "the user search for any invalid asset",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user should be able to get the message as \"No records found\"",
  "keyword": "Then "
});
formatter.match({
  "location": "assetdetails.the_user_is_in_Asset_details_page()"
});
formatter.result({
  "duration": 3091870114,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_selects_values_from_the_dropdowns_and_clicks_on_view_button()"
});
formatter.result({
  "duration": 13394892013,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_search_for_any_invalid_asset()"
});
formatter.result({
  "duration": 5255141770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No records found",
      "offset": 43
    }
  ],
  "location": "assetdetails.user_should_be_able_to_get_the_message_as(String)"
});
formatter.result({
  "duration": 3089369177,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Validating the clear search icon presence",
  "description": "",
  "id": "asset-detail-features;validating-the-clear-search-icon-presence",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "the user is in Asset details page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "the user selects values from the dropdowns and clicks on view button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "the user search starts typing text inside the search field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "the clear selection icon should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "assetdetails.the_user_is_in_Asset_details_page()"
});
formatter.result({
  "duration": 3103311593,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_selects_values_from_the_dropdowns_and_clicks_on_view_button()"
});
formatter.result({
  "duration": 13441811067,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_user_search_starts_typing_text_inside_the_search_field()"
});
formatter.result({
  "duration": 6166672041,
  "status": "passed"
});
formatter.match({
  "location": "assetdetails.the_clear_selection_icon_should_appear()"
});
formatter.result({
  "duration": 39021373,
  "status": "passed"
});
});