/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkSsh {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkSsh(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkSsh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkSsh(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkSsh() {
    this(chilkatJNI.new_CkSsh(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkSsh_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkSsh_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkSsh_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkSsh_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkSsh_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkSsh_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkSsh_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkSsh_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkSsh_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkSsh_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkSsh_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkSsh_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkSsh_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkSsh_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkSsh_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkSsh_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkSsh_SaveLastError(swigCPtr, this, path);
  }

  public int get_ChannelOpenFailCode() {
    return chilkatJNI.CkSsh_get_ChannelOpenFailCode(swigCPtr, this);
  }

  public void get_ChannelOpenFailReason(CkString str) {
    chilkatJNI.CkSsh_get_ChannelOpenFailReason(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String channelOpenFailReason() {
    return chilkatJNI.CkSsh_channelOpenFailReason(swigCPtr, this);
  }

  public void get_ClientIdentifier(CkString str) {
    chilkatJNI.CkSsh_get_ClientIdentifier(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientIdentifier() {
    return chilkatJNI.CkSsh_clientIdentifier(swigCPtr, this);
  }

  public void put_ClientIdentifier(String newVal) {
    chilkatJNI.CkSsh_put_ClientIdentifier(swigCPtr, this, newVal);
  }

  public void get_ClientIpAddress(CkString str) {
    chilkatJNI.CkSsh_get_ClientIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientIpAddress() {
    return chilkatJNI.CkSsh_clientIpAddress(swigCPtr, this);
  }

  public void put_ClientIpAddress(String newVal) {
    chilkatJNI.CkSsh_put_ClientIpAddress(swigCPtr, this, newVal);
  }

  public int get_ConnectTimeoutMs() {
    return chilkatJNI.CkSsh_get_ConnectTimeoutMs(swigCPtr, this);
  }

  public void put_ConnectTimeoutMs(int newVal) {
    chilkatJNI.CkSsh_put_ConnectTimeoutMs(swigCPtr, this, newVal);
  }

  public int get_DisconnectCode() {
    return chilkatJNI.CkSsh_get_DisconnectCode(swigCPtr, this);
  }

  public void get_DisconnectReason(CkString str) {
    chilkatJNI.CkSsh_get_DisconnectReason(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String disconnectReason() {
    return chilkatJNI.CkSsh_disconnectReason(swigCPtr, this);
  }

  public void get_ForceCipher(CkString str) {
    chilkatJNI.CkSsh_get_ForceCipher(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String forceCipher() {
    return chilkatJNI.CkSsh_forceCipher(swigCPtr, this);
  }

  public void put_ForceCipher(String newVal) {
    chilkatJNI.CkSsh_put_ForceCipher(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkSsh_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkSsh_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_HostKeyAlg(CkString str) {
    chilkatJNI.CkSsh_get_HostKeyAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hostKeyAlg() {
    return chilkatJNI.CkSsh_hostKeyAlg(swigCPtr, this);
  }

  public void put_HostKeyAlg(String newVal) {
    chilkatJNI.CkSsh_put_HostKeyAlg(swigCPtr, this, newVal);
  }

  public void get_HostKeyFingerprint(CkString str) {
    chilkatJNI.CkSsh_get_HostKeyFingerprint(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hostKeyFingerprint() {
    return chilkatJNI.CkSsh_hostKeyFingerprint(swigCPtr, this);
  }

  public void get_HttpProxyAuthMethod(CkString str) {
    chilkatJNI.CkSsh_get_HttpProxyAuthMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyAuthMethod() {
    return chilkatJNI.CkSsh_httpProxyAuthMethod(swigCPtr, this);
  }

  public void put_HttpProxyAuthMethod(String newVal) {
    chilkatJNI.CkSsh_put_HttpProxyAuthMethod(swigCPtr, this, newVal);
  }

  public void get_HttpProxyDomain(CkString str) {
    chilkatJNI.CkSsh_get_HttpProxyDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyDomain() {
    return chilkatJNI.CkSsh_httpProxyDomain(swigCPtr, this);
  }

  public void put_HttpProxyDomain(String newVal) {
    chilkatJNI.CkSsh_put_HttpProxyDomain(swigCPtr, this, newVal);
  }

  public void get_HttpProxyHostname(CkString str) {
    chilkatJNI.CkSsh_get_HttpProxyHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyHostname() {
    return chilkatJNI.CkSsh_httpProxyHostname(swigCPtr, this);
  }

  public void put_HttpProxyHostname(String newVal) {
    chilkatJNI.CkSsh_put_HttpProxyHostname(swigCPtr, this, newVal);
  }

  public void get_HttpProxyPassword(CkString str) {
    chilkatJNI.CkSsh_get_HttpProxyPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyPassword() {
    return chilkatJNI.CkSsh_httpProxyPassword(swigCPtr, this);
  }

  public void put_HttpProxyPassword(String newVal) {
    chilkatJNI.CkSsh_put_HttpProxyPassword(swigCPtr, this, newVal);
  }

  public int get_HttpProxyPort() {
    return chilkatJNI.CkSsh_get_HttpProxyPort(swigCPtr, this);
  }

  public void put_HttpProxyPort(int newVal) {
    chilkatJNI.CkSsh_put_HttpProxyPort(swigCPtr, this, newVal);
  }

  public void get_HttpProxyUsername(CkString str) {
    chilkatJNI.CkSsh_get_HttpProxyUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyUsername() {
    return chilkatJNI.CkSsh_httpProxyUsername(swigCPtr, this);
  }

  public void put_HttpProxyUsername(String newVal) {
    chilkatJNI.CkSsh_put_HttpProxyUsername(swigCPtr, this, newVal);
  }

  public int get_IdleTimeoutMs() {
    return chilkatJNI.CkSsh_get_IdleTimeoutMs(swigCPtr, this);
  }

  public void put_IdleTimeoutMs(int newVal) {
    chilkatJNI.CkSsh_put_IdleTimeoutMs(swigCPtr, this, newVal);
  }

  public boolean get_IsConnected() {
    return chilkatJNI.CkSsh_get_IsConnected(swigCPtr, this);
  }

  public boolean get_KeepSessionLog() {
    return chilkatJNI.CkSsh_get_KeepSessionLog(swigCPtr, this);
  }

  public void put_KeepSessionLog(boolean newVal) {
    chilkatJNI.CkSsh_put_KeepSessionLog(swigCPtr, this, newVal);
  }

  public int get_MaxPacketSize() {
    return chilkatJNI.CkSsh_get_MaxPacketSize(swigCPtr, this);
  }

  public void put_MaxPacketSize(int newVal) {
    chilkatJNI.CkSsh_put_MaxPacketSize(swigCPtr, this, newVal);
  }

  public int get_NumOpenChannels() {
    return chilkatJNI.CkSsh_get_NumOpenChannels(swigCPtr, this);
  }

  public boolean get_PasswordChangeRequested() {
    return chilkatJNI.CkSsh_get_PasswordChangeRequested(swigCPtr, this);
  }

  public boolean get_PreferIpv6() {
    return chilkatJNI.CkSsh_get_PreferIpv6(swigCPtr, this);
  }

  public void put_PreferIpv6(boolean newVal) {
    chilkatJNI.CkSsh_put_PreferIpv6(swigCPtr, this, newVal);
  }

  public int get_ReadTimeoutMs() {
    return chilkatJNI.CkSsh_get_ReadTimeoutMs(swigCPtr, this);
  }

  public void put_ReadTimeoutMs(int newVal) {
    chilkatJNI.CkSsh_put_ReadTimeoutMs(swigCPtr, this, newVal);
  }

  public void get_SessionLog(CkString str) {
    chilkatJNI.CkSsh_get_SessionLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sessionLog() {
    return chilkatJNI.CkSsh_sessionLog(swigCPtr, this);
  }

  public int get_SoRcvBuf() {
    return chilkatJNI.CkSsh_get_SoRcvBuf(swigCPtr, this);
  }

  public void put_SoRcvBuf(int newVal) {
    chilkatJNI.CkSsh_put_SoRcvBuf(swigCPtr, this, newVal);
  }

  public int get_SoSndBuf() {
    return chilkatJNI.CkSsh_get_SoSndBuf(swigCPtr, this);
  }

  public void put_SoSndBuf(int newVal) {
    chilkatJNI.CkSsh_put_SoSndBuf(swigCPtr, this, newVal);
  }

  public void get_SocksHostname(CkString str) {
    chilkatJNI.CkSsh_get_SocksHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksHostname() {
    return chilkatJNI.CkSsh_socksHostname(swigCPtr, this);
  }

  public void put_SocksHostname(String newVal) {
    chilkatJNI.CkSsh_put_SocksHostname(swigCPtr, this, newVal);
  }

  public void get_SocksPassword(CkString str) {
    chilkatJNI.CkSsh_get_SocksPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksPassword() {
    return chilkatJNI.CkSsh_socksPassword(swigCPtr, this);
  }

  public void put_SocksPassword(String newVal) {
    chilkatJNI.CkSsh_put_SocksPassword(swigCPtr, this, newVal);
  }

  public int get_SocksPort() {
    return chilkatJNI.CkSsh_get_SocksPort(swigCPtr, this);
  }

  public void put_SocksPort(int newVal) {
    chilkatJNI.CkSsh_put_SocksPort(swigCPtr, this, newVal);
  }

  public void get_SocksUsername(CkString str) {
    chilkatJNI.CkSsh_get_SocksUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksUsername() {
    return chilkatJNI.CkSsh_socksUsername(swigCPtr, this);
  }

  public void put_SocksUsername(String newVal) {
    chilkatJNI.CkSsh_put_SocksUsername(swigCPtr, this, newVal);
  }

  public int get_SocksVersion() {
    return chilkatJNI.CkSsh_get_SocksVersion(swigCPtr, this);
  }

  public void put_SocksVersion(int newVal) {
    chilkatJNI.CkSsh_put_SocksVersion(swigCPtr, this, newVal);
  }

  public boolean get_StderrToStdout() {
    return chilkatJNI.CkSsh_get_StderrToStdout(swigCPtr, this);
  }

  public void put_StderrToStdout(boolean newVal) {
    chilkatJNI.CkSsh_put_StderrToStdout(swigCPtr, this, newVal);
  }

  public boolean get_TcpNoDelay() {
    return chilkatJNI.CkSsh_get_TcpNoDelay(swigCPtr, this);
  }

  public void put_TcpNoDelay(boolean newVal) {
    chilkatJNI.CkSsh_put_TcpNoDelay(swigCPtr, this, newVal);
  }

  public void get_UserAuthBanner(CkString str) {
    chilkatJNI.CkSsh_get_UserAuthBanner(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String userAuthBanner() {
    return chilkatJNI.CkSsh_userAuthBanner(swigCPtr, this);
  }

  public void put_UserAuthBanner(String newVal) {
    chilkatJNI.CkSsh_put_UserAuthBanner(swigCPtr, this, newVal);
  }

  public void get_ReqExecCharset(CkString str) {
    chilkatJNI.CkSsh_get_ReqExecCharset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String reqExecCharset() {
    return chilkatJNI.CkSsh_reqExecCharset(swigCPtr, this);
  }

  public void put_ReqExecCharset(String newVal) {
    chilkatJNI.CkSsh_put_ReqExecCharset(swigCPtr, this, newVal);
  }

  public boolean AuthenticatePk(String username, CkSshKey privateKey) {
    return chilkatJNI.CkSsh_AuthenticatePk(swigCPtr, this, username, CkSshKey.getCPtr(privateKey), privateKey);
  }

  public boolean AuthenticatePw(String login, String password) {
    return chilkatJNI.CkSsh_AuthenticatePw(swigCPtr, this, login, password);
  }

  public boolean AuthenticatePwPk(String username, String password, CkSshKey privateKey) {
    return chilkatJNI.CkSsh_AuthenticatePwPk(swigCPtr, this, username, password, CkSshKey.getCPtr(privateKey), privateKey);
  }

  public boolean ChannelIsOpen(int channelNum) {
    return chilkatJNI.CkSsh_ChannelIsOpen(swigCPtr, this, channelNum);
  }

  public int ChannelPoll(int channelNum, int pollTimeoutMs) {
    return chilkatJNI.CkSsh_ChannelPoll(swigCPtr, this, channelNum, pollTimeoutMs);
  }

  public int ChannelRead(int channelNum) {
    return chilkatJNI.CkSsh_ChannelRead(swigCPtr, this, channelNum);
  }

  public int ChannelReadAndPoll(int channelNum, int pollTimeoutMs) {
    return chilkatJNI.CkSsh_ChannelReadAndPoll(swigCPtr, this, channelNum, pollTimeoutMs);
  }

  public int ChannelReadAndPoll2(int channelNum, int pollTimeoutMs, int maxNumBytes) {
    return chilkatJNI.CkSsh_ChannelReadAndPoll2(swigCPtr, this, channelNum, pollTimeoutMs, maxNumBytes);
  }

  public boolean ChannelReceiveToClose(int channelNum) {
    return chilkatJNI.CkSsh_ChannelReceiveToClose(swigCPtr, this, channelNum);
  }

  public boolean ChannelReceiveUntilMatch(int channelNum, String matchPattern, String charset, boolean caseSensitive) {
    return chilkatJNI.CkSsh_ChannelReceiveUntilMatch(swigCPtr, this, channelNum, matchPattern, charset, caseSensitive);
  }

  public boolean ChannelReceiveUntilMatchN(int channelNum, CkStringArray matchPatterns, String charset, boolean caseSensitive) {
    return chilkatJNI.CkSsh_ChannelReceiveUntilMatchN(swigCPtr, this, channelNum, CkStringArray.getCPtr(matchPatterns), matchPatterns, charset, caseSensitive);
  }

  public boolean ChannelReceivedClose(int channelNum) {
    return chilkatJNI.CkSsh_ChannelReceivedClose(swigCPtr, this, channelNum);
  }

  public boolean ChannelReceivedEof(int channelNum) {
    return chilkatJNI.CkSsh_ChannelReceivedEof(swigCPtr, this, channelNum);
  }

  public boolean ChannelReceivedExitStatus(int channelNum) {
    return chilkatJNI.CkSsh_ChannelReceivedExitStatus(swigCPtr, this, channelNum);
  }

  public void ChannelRelease(int channelNum) {
    chilkatJNI.CkSsh_ChannelRelease(swigCPtr, this, channelNum);
  }

  public boolean ChannelSendClose(int channelNum) {
    return chilkatJNI.CkSsh_ChannelSendClose(swigCPtr, this, channelNum);
  }

  public boolean ChannelSendData(int channelNum, CkByteData data) {
    return chilkatJNI.CkSsh_ChannelSendData(swigCPtr, this, channelNum, CkByteData.getCPtr(data), data);
  }

  public boolean ChannelSendEof(int channelNum) {
    return chilkatJNI.CkSsh_ChannelSendEof(swigCPtr, this, channelNum);
  }

  public boolean ChannelSendString(int channelNum, String strData, String charset) {
    return chilkatJNI.CkSsh_ChannelSendString(swigCPtr, this, channelNum, strData, charset);
  }

  public boolean CheckConnection() {
    return chilkatJNI.CkSsh_CheckConnection(swigCPtr, this);
  }

  public void ClearTtyModes() {
    chilkatJNI.CkSsh_ClearTtyModes(swigCPtr, this);
  }

  public boolean Connect(String hostname, int port) {
    return chilkatJNI.CkSsh_Connect(swigCPtr, this, hostname, port);
  }

  public boolean ContinueKeyboardAuth(String response, CkString outStr) {
    return chilkatJNI.CkSsh_ContinueKeyboardAuth(swigCPtr, this, response, CkString.getCPtr(outStr), outStr);
  }

  public String continueKeyboardAuth(String response) {
    return chilkatJNI.CkSsh_continueKeyboardAuth(swigCPtr, this, response);
  }

  public void Disconnect() {
    chilkatJNI.CkSsh_Disconnect(swigCPtr, this);
  }

  public int GetChannelExitStatus(int channelNum) {
    return chilkatJNI.CkSsh_GetChannelExitStatus(swigCPtr, this, channelNum);
  }

  public int GetChannelNumber(int index) {
    return chilkatJNI.CkSsh_GetChannelNumber(swigCPtr, this, index);
  }

  public boolean GetChannelType(int index, CkString outStr) {
    return chilkatJNI.CkSsh_GetChannelType(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getChannelType(int index) {
    return chilkatJNI.CkSsh_getChannelType(swigCPtr, this, index);
  }

  public String channelType(int index) {
    return chilkatJNI.CkSsh_channelType(swigCPtr, this, index);
  }

  public boolean GetReceivedData(int channelNum, CkByteData outBytes) {
    return chilkatJNI.CkSsh_GetReceivedData(swigCPtr, this, channelNum, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean GetReceivedDataN(int channelNum, int numBytes, CkByteData outBytes) {
    return chilkatJNI.CkSsh_GetReceivedDataN(swigCPtr, this, channelNum, numBytes, CkByteData.getCPtr(outBytes), outBytes);
  }

  public int GetReceivedNumBytes(int channelNum) {
    return chilkatJNI.CkSsh_GetReceivedNumBytes(swigCPtr, this, channelNum);
  }

  public boolean GetReceivedStderr(int channelNum, CkByteData outBytes) {
    return chilkatJNI.CkSsh_GetReceivedStderr(swigCPtr, this, channelNum, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean GetReceivedText(int channelNum, String charset, CkString outStr) {
    return chilkatJNI.CkSsh_GetReceivedText(swigCPtr, this, channelNum, charset, CkString.getCPtr(outStr), outStr);
  }

  public String getReceivedText(int channelNum, String charset) {
    return chilkatJNI.CkSsh_getReceivedText(swigCPtr, this, channelNum, charset);
  }

  public String receivedText(int channelNum, String charset) {
    return chilkatJNI.CkSsh_receivedText(swigCPtr, this, channelNum, charset);
  }

  public boolean GetReceivedStderrText(int channelNum, String charset, CkString outStr) {
    return chilkatJNI.CkSsh_GetReceivedStderrText(swigCPtr, this, channelNum, charset, CkString.getCPtr(outStr), outStr);
  }

  public String getReceivedStderrText(int channelNum, String charset) {
    return chilkatJNI.CkSsh_getReceivedStderrText(swigCPtr, this, channelNum, charset);
  }

  public String receivedStderrText(int channelNum, String charset) {
    return chilkatJNI.CkSsh_receivedStderrText(swigCPtr, this, channelNum, charset);
  }

  public boolean GetReceivedTextS(int channelNum, String substr, String charset, CkString outStr) {
    return chilkatJNI.CkSsh_GetReceivedTextS(swigCPtr, this, channelNum, substr, charset, CkString.getCPtr(outStr), outStr);
  }

  public String getReceivedTextS(int channelNum, String substr, String charset) {
    return chilkatJNI.CkSsh_getReceivedTextS(swigCPtr, this, channelNum, substr, charset);
  }

  public String receivedTextS(int channelNum, String substr, String charset) {
    return chilkatJNI.CkSsh_receivedTextS(swigCPtr, this, channelNum, substr, charset);
  }

  public int OpenCustomChannel(String channelType) {
    return chilkatJNI.CkSsh_OpenCustomChannel(swigCPtr, this, channelType);
  }

  public int OpenDirectTcpIpChannel(String hostname, int port) {
    return chilkatJNI.CkSsh_OpenDirectTcpIpChannel(swigCPtr, this, hostname, port);
  }

  public int OpenSessionChannel() {
    return chilkatJNI.CkSsh_OpenSessionChannel(swigCPtr, this);
  }

  public boolean PeekReceivedText(int channelNum, String charset, CkString outStr) {
    return chilkatJNI.CkSsh_PeekReceivedText(swigCPtr, this, channelNum, charset, CkString.getCPtr(outStr), outStr);
  }

  public String peekReceivedText(int channelNum, String charset) {
    return chilkatJNI.CkSsh_peekReceivedText(swigCPtr, this, channelNum, charset);
  }

  public boolean ReKey() {
    return chilkatJNI.CkSsh_ReKey(swigCPtr, this);
  }

  public boolean SendIgnore() {
    return chilkatJNI.CkSsh_SendIgnore(swigCPtr, this);
  }

  public boolean SendReqExec(int channelNum, String command) {
    return chilkatJNI.CkSsh_SendReqExec(swigCPtr, this, channelNum, command);
  }

  public boolean SendReqPty(int channelNum, String xTermEnvVar, int widthInChars, int heightInRows, int pixWidth, int pixHeight) {
    return chilkatJNI.CkSsh_SendReqPty(swigCPtr, this, channelNum, xTermEnvVar, widthInChars, heightInRows, pixWidth, pixHeight);
  }

  public boolean SendReqSetEnv(int channelNum, String name, String value) {
    return chilkatJNI.CkSsh_SendReqSetEnv(swigCPtr, this, channelNum, name, value);
  }

  public boolean SendReqShell(int channelNum) {
    return chilkatJNI.CkSsh_SendReqShell(swigCPtr, this, channelNum);
  }

  public boolean SendReqSignal(int channelNum, String signalName) {
    return chilkatJNI.CkSsh_SendReqSignal(swigCPtr, this, channelNum, signalName);
  }

  public boolean SendReqSubsystem(int channelNum, String subsystemName) {
    return chilkatJNI.CkSsh_SendReqSubsystem(swigCPtr, this, channelNum, subsystemName);
  }

  public boolean SendReqWindowChange(int channelNum, int widthInChars, int heightInRows, int pixWidth, int pixHeight) {
    return chilkatJNI.CkSsh_SendReqWindowChange(swigCPtr, this, channelNum, widthInChars, heightInRows, pixWidth, pixHeight);
  }

  public boolean SendReqX11Forwarding(int channelNum, boolean singleConnection, String authProt, String authCookie, int screenNum) {
    return chilkatJNI.CkSsh_SendReqX11Forwarding(swigCPtr, this, channelNum, singleConnection, authProt, authCookie, screenNum);
  }

  public boolean SendReqXonXoff(int channelNum, boolean clientCanDo) {
    return chilkatJNI.CkSsh_SendReqXonXoff(swigCPtr, this, channelNum, clientCanDo);
  }

  public boolean SetTtyMode(String name, int value) {
    return chilkatJNI.CkSsh_SetTtyMode(swigCPtr, this, name, value);
  }

  public boolean StartKeyboardAuth(String login, CkString outStr) {
    return chilkatJNI.CkSsh_StartKeyboardAuth(swigCPtr, this, login, CkString.getCPtr(outStr), outStr);
  }

  public String startKeyboardAuth(String login) {
    return chilkatJNI.CkSsh_startKeyboardAuth(swigCPtr, this, login);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkSsh_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public int WaitForChannelMessage(int pollTimeoutMs) {
    return chilkatJNI.CkSsh_WaitForChannelMessage(swigCPtr, this, pollTimeoutMs);
  }

}
