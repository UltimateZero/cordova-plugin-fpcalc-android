/*global cordova, module*/

module.exports = {
    fingerprint: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Fingerprint", "fingerprint", [name]);
    }
};
