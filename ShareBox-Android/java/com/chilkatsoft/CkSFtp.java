/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkSFtp {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkSFtp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkSFtp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkSFtp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkSFtp() {
    this(chilkatJNI.new_CkSFtp(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkSFtp_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkSFtp_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkSFtp_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkSFtp_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkSFtp_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkSFtp_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkSFtp_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkSFtp_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkSFtp_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkSFtp_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkSFtp_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkSFtp_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkSFtp_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkSFtp_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkSFtp_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkSFtp_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkSFtp_SaveLastError(swigCPtr, this, path);
  }

  public void get_AccumulateBuffer(CkByteData outBytes) {
    chilkatJNI.CkSFtp_get_AccumulateBuffer(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void get_ClientIdentifier(CkString str) {
    chilkatJNI.CkSFtp_get_ClientIdentifier(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientIdentifier() {
    return chilkatJNI.CkSFtp_clientIdentifier(swigCPtr, this);
  }

  public void put_ClientIdentifier(String newVal) {
    chilkatJNI.CkSFtp_put_ClientIdentifier(swigCPtr, this, newVal);
  }

  public void get_ClientIpAddress(CkString str) {
    chilkatJNI.CkSFtp_get_ClientIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientIpAddress() {
    return chilkatJNI.CkSFtp_clientIpAddress(swigCPtr, this);
  }

  public void put_ClientIpAddress(String newVal) {
    chilkatJNI.CkSFtp_put_ClientIpAddress(swigCPtr, this, newVal);
  }

  public int get_ConnectTimeoutMs() {
    return chilkatJNI.CkSFtp_get_ConnectTimeoutMs(swigCPtr, this);
  }

  public void put_ConnectTimeoutMs(int newVal) {
    chilkatJNI.CkSFtp_put_ConnectTimeoutMs(swigCPtr, this, newVal);
  }

  public int get_DisconnectCode() {
    return chilkatJNI.CkSFtp_get_DisconnectCode(swigCPtr, this);
  }

  public void get_DisconnectReason(CkString str) {
    chilkatJNI.CkSFtp_get_DisconnectReason(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String disconnectReason() {
    return chilkatJNI.CkSFtp_disconnectReason(swigCPtr, this);
  }

  public boolean get_EnableCache() {
    return chilkatJNI.CkSFtp_get_EnableCache(swigCPtr, this);
  }

  public void put_EnableCache(boolean newVal) {
    chilkatJNI.CkSFtp_put_EnableCache(swigCPtr, this, newVal);
  }

  public void get_FilenameCharset(CkString str) {
    chilkatJNI.CkSFtp_get_FilenameCharset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String filenameCharset() {
    return chilkatJNI.CkSFtp_filenameCharset(swigCPtr, this);
  }

  public void put_FilenameCharset(String newVal) {
    chilkatJNI.CkSFtp_put_FilenameCharset(swigCPtr, this, newVal);
  }

  public void get_ForceCipher(CkString str) {
    chilkatJNI.CkSFtp_get_ForceCipher(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String forceCipher() {
    return chilkatJNI.CkSFtp_forceCipher(swigCPtr, this);
  }

  public void put_ForceCipher(String newVal) {
    chilkatJNI.CkSFtp_put_ForceCipher(swigCPtr, this, newVal);
  }

  public boolean get_ForceV3() {
    return chilkatJNI.CkSFtp_get_ForceV3(swigCPtr, this);
  }

  public void put_ForceV3(boolean newVal) {
    chilkatJNI.CkSFtp_put_ForceV3(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkSFtp_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkSFtp_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_HostKeyAlg(CkString str) {
    chilkatJNI.CkSFtp_get_HostKeyAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hostKeyAlg() {
    return chilkatJNI.CkSFtp_hostKeyAlg(swigCPtr, this);
  }

  public void put_HostKeyAlg(String newVal) {
    chilkatJNI.CkSFtp_put_HostKeyAlg(swigCPtr, this, newVal);
  }

  public void get_HostKeyFingerprint(CkString str) {
    chilkatJNI.CkSFtp_get_HostKeyFingerprint(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hostKeyFingerprint() {
    return chilkatJNI.CkSFtp_hostKeyFingerprint(swigCPtr, this);
  }

  public void get_HttpProxyAuthMethod(CkString str) {
    chilkatJNI.CkSFtp_get_HttpProxyAuthMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyAuthMethod() {
    return chilkatJNI.CkSFtp_httpProxyAuthMethod(swigCPtr, this);
  }

  public void put_HttpProxyAuthMethod(String newVal) {
    chilkatJNI.CkSFtp_put_HttpProxyAuthMethod(swigCPtr, this, newVal);
  }

  public void get_HttpProxyDomain(CkString str) {
    chilkatJNI.CkSFtp_get_HttpProxyDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyDomain() {
    return chilkatJNI.CkSFtp_httpProxyDomain(swigCPtr, this);
  }

  public void put_HttpProxyDomain(String newVal) {
    chilkatJNI.CkSFtp_put_HttpProxyDomain(swigCPtr, this, newVal);
  }

  public void get_HttpProxyHostname(CkString str) {
    chilkatJNI.CkSFtp_get_HttpProxyHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyHostname() {
    return chilkatJNI.CkSFtp_httpProxyHostname(swigCPtr, this);
  }

  public void put_HttpProxyHostname(String newVal) {
    chilkatJNI.CkSFtp_put_HttpProxyHostname(swigCPtr, this, newVal);
  }

  public void get_HttpProxyPassword(CkString str) {
    chilkatJNI.CkSFtp_get_HttpProxyPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyPassword() {
    return chilkatJNI.CkSFtp_httpProxyPassword(swigCPtr, this);
  }

  public void put_HttpProxyPassword(String newVal) {
    chilkatJNI.CkSFtp_put_HttpProxyPassword(swigCPtr, this, newVal);
  }

  public int get_HttpProxyPort() {
    return chilkatJNI.CkSFtp_get_HttpProxyPort(swigCPtr, this);
  }

  public void put_HttpProxyPort(int newVal) {
    chilkatJNI.CkSFtp_put_HttpProxyPort(swigCPtr, this, newVal);
  }

  public void get_HttpProxyUsername(CkString str) {
    chilkatJNI.CkSFtp_get_HttpProxyUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyUsername() {
    return chilkatJNI.CkSFtp_httpProxyUsername(swigCPtr, this);
  }

  public void put_HttpProxyUsername(String newVal) {
    chilkatJNI.CkSFtp_put_HttpProxyUsername(swigCPtr, this, newVal);
  }

  public int get_IdleTimeoutMs() {
    return chilkatJNI.CkSFtp_get_IdleTimeoutMs(swigCPtr, this);
  }

  public void put_IdleTimeoutMs(int newVal) {
    chilkatJNI.CkSFtp_put_IdleTimeoutMs(swigCPtr, this, newVal);
  }

  public boolean get_IncludeDotDirs() {
    return chilkatJNI.CkSFtp_get_IncludeDotDirs(swigCPtr, this);
  }

  public void put_IncludeDotDirs(boolean newVal) {
    chilkatJNI.CkSFtp_put_IncludeDotDirs(swigCPtr, this, newVal);
  }

  public int get_InitializeFailCode() {
    return chilkatJNI.CkSFtp_get_InitializeFailCode(swigCPtr, this);
  }

  public void get_InitializeFailReason(CkString str) {
    chilkatJNI.CkSFtp_get_InitializeFailReason(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String initializeFailReason() {
    return chilkatJNI.CkSFtp_initializeFailReason(swigCPtr, this);
  }

  public boolean get_IsConnected() {
    return chilkatJNI.CkSFtp_get_IsConnected(swigCPtr, this);
  }

  public boolean get_KeepSessionLog() {
    return chilkatJNI.CkSFtp_get_KeepSessionLog(swigCPtr, this);
  }

  public void put_KeepSessionLog(boolean newVal) {
    chilkatJNI.CkSFtp_put_KeepSessionLog(swigCPtr, this, newVal);
  }

  public int get_MaxPacketSize() {
    return chilkatJNI.CkSFtp_get_MaxPacketSize(swigCPtr, this);
  }

  public void put_MaxPacketSize(int newVal) {
    chilkatJNI.CkSFtp_put_MaxPacketSize(swigCPtr, this, newVal);
  }

  public boolean get_PasswordChangeRequested() {
    return chilkatJNI.CkSFtp_get_PasswordChangeRequested(swigCPtr, this);
  }

  public boolean get_PreferIpv6() {
    return chilkatJNI.CkSFtp_get_PreferIpv6(swigCPtr, this);
  }

  public void put_PreferIpv6(boolean newVal) {
    chilkatJNI.CkSFtp_put_PreferIpv6(swigCPtr, this, newVal);
  }

  public boolean get_PreserveDate() {
    return chilkatJNI.CkSFtp_get_PreserveDate(swigCPtr, this);
  }

  public void put_PreserveDate(boolean newVal) {
    chilkatJNI.CkSFtp_put_PreserveDate(swigCPtr, this, newVal);
  }

  public int get_ProtocolVersion() {
    return chilkatJNI.CkSFtp_get_ProtocolVersion(swigCPtr, this);
  }

  public void get_SessionLog(CkString str) {
    chilkatJNI.CkSFtp_get_SessionLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sessionLog() {
    return chilkatJNI.CkSFtp_sessionLog(swigCPtr, this);
  }

  public int get_SoRcvBuf() {
    return chilkatJNI.CkSFtp_get_SoRcvBuf(swigCPtr, this);
  }

  public void put_SoRcvBuf(int newVal) {
    chilkatJNI.CkSFtp_put_SoRcvBuf(swigCPtr, this, newVal);
  }

  public int get_SoSndBuf() {
    return chilkatJNI.CkSFtp_get_SoSndBuf(swigCPtr, this);
  }

  public void put_SoSndBuf(int newVal) {
    chilkatJNI.CkSFtp_put_SoSndBuf(swigCPtr, this, newVal);
  }

  public void get_SocksHostname(CkString str) {
    chilkatJNI.CkSFtp_get_SocksHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksHostname() {
    return chilkatJNI.CkSFtp_socksHostname(swigCPtr, this);
  }

  public void put_SocksHostname(String newVal) {
    chilkatJNI.CkSFtp_put_SocksHostname(swigCPtr, this, newVal);
  }

  public void get_SocksPassword(CkString str) {
    chilkatJNI.CkSFtp_get_SocksPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksPassword() {
    return chilkatJNI.CkSFtp_socksPassword(swigCPtr, this);
  }

  public void put_SocksPassword(String newVal) {
    chilkatJNI.CkSFtp_put_SocksPassword(swigCPtr, this, newVal);
  }

  public int get_SocksPort() {
    return chilkatJNI.CkSFtp_get_SocksPort(swigCPtr, this);
  }

  public void put_SocksPort(int newVal) {
    chilkatJNI.CkSFtp_put_SocksPort(swigCPtr, this, newVal);
  }

  public void get_SocksUsername(CkString str) {
    chilkatJNI.CkSFtp_get_SocksUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksUsername() {
    return chilkatJNI.CkSFtp_socksUsername(swigCPtr, this);
  }

  public void put_SocksUsername(String newVal) {
    chilkatJNI.CkSFtp_put_SocksUsername(swigCPtr, this, newVal);
  }

  public int get_SocksVersion() {
    return chilkatJNI.CkSFtp_get_SocksVersion(swigCPtr, this);
  }

  public void put_SocksVersion(int newVal) {
    chilkatJNI.CkSFtp_put_SocksVersion(swigCPtr, this, newVal);
  }

  public void get_SyncMustMatch(CkString str) {
    chilkatJNI.CkSFtp_get_SyncMustMatch(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String syncMustMatch() {
    return chilkatJNI.CkSFtp_syncMustMatch(swigCPtr, this);
  }

  public void put_SyncMustMatch(String newVal) {
    chilkatJNI.CkSFtp_put_SyncMustMatch(swigCPtr, this, newVal);
  }

  public void get_SyncMustNotMatch(CkString str) {
    chilkatJNI.CkSFtp_get_SyncMustNotMatch(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String syncMustNotMatch() {
    return chilkatJNI.CkSFtp_syncMustNotMatch(swigCPtr, this);
  }

  public void put_SyncMustNotMatch(String newVal) {
    chilkatJNI.CkSFtp_put_SyncMustNotMatch(swigCPtr, this, newVal);
  }

  public boolean get_TcpNoDelay() {
    return chilkatJNI.CkSFtp_get_TcpNoDelay(swigCPtr, this);
  }

  public void put_TcpNoDelay(boolean newVal) {
    chilkatJNI.CkSFtp_put_TcpNoDelay(swigCPtr, this, newVal);
  }

  public int get_UploadChunkSize() {
    return chilkatJNI.CkSFtp_get_UploadChunkSize(swigCPtr, this);
  }

  public void put_UploadChunkSize(int newVal) {
    chilkatJNI.CkSFtp_put_UploadChunkSize(swigCPtr, this, newVal);
  }

  public boolean get_UtcMode() {
    return chilkatJNI.CkSFtp_get_UtcMode(swigCPtr, this);
  }

  public void put_UtcMode(boolean newVal) {
    chilkatJNI.CkSFtp_put_UtcMode(swigCPtr, this, newVal);
  }

  public int AccumulateBytes(String handle, int maxBytes) {
    return chilkatJNI.CkSFtp_AccumulateBytes(swigCPtr, this, handle, maxBytes);
  }

  public boolean Add64(String n1, String n2, CkString outStr) {
    return chilkatJNI.CkSFtp_Add64(swigCPtr, this, n1, n2, CkString.getCPtr(outStr), outStr);
  }

  public String add64(String n1, String n2) {
    return chilkatJNI.CkSFtp_add64(swigCPtr, this, n1, n2);
  }

  public boolean AuthenticatePk(String username, CkSshKey privateKey) {
    return chilkatJNI.CkSFtp_AuthenticatePk(swigCPtr, this, username, CkSshKey.getCPtr(privateKey), privateKey);
  }

  public boolean AuthenticatePw(String login, String password) {
    return chilkatJNI.CkSFtp_AuthenticatePw(swigCPtr, this, login, password);
  }

  public boolean AuthenticatePwPk(String username, String password, CkSshKey privateKey) {
    return chilkatJNI.CkSFtp_AuthenticatePwPk(swigCPtr, this, username, password, CkSshKey.getCPtr(privateKey), privateKey);
  }

  public void ClearAccumulateBuffer() {
    chilkatJNI.CkSFtp_ClearAccumulateBuffer(swigCPtr, this);
  }

  public void ClearCache() {
    chilkatJNI.CkSFtp_ClearCache(swigCPtr, this);
  }

  public void ClearSessionLog() {
    chilkatJNI.CkSFtp_ClearSessionLog(swigCPtr, this);
  }

  public boolean CloseHandle(String handle) {
    return chilkatJNI.CkSFtp_CloseHandle(swigCPtr, this, handle);
  }

  public boolean Connect(String hostname, int port) {
    return chilkatJNI.CkSFtp_Connect(swigCPtr, this, hostname, port);
  }

  public boolean CopyFileAttr(String localFilename, String remoteFilename, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_CopyFileAttr(swigCPtr, this, localFilename, remoteFilename, bIsHandle);
  }

  public boolean CreateDir(String path) {
    return chilkatJNI.CkSFtp_CreateDir(swigCPtr, this, path);
  }

  public void Disconnect() {
    chilkatJNI.CkSFtp_Disconnect(swigCPtr, this);
  }

  public boolean DownloadFile(String handle, String toFilename) {
    return chilkatJNI.CkSFtp_DownloadFile(swigCPtr, this, handle, toFilename);
  }

  public boolean DownloadFileByName(String remoteFilePath, String localFilePath) {
    return chilkatJNI.CkSFtp_DownloadFileByName(swigCPtr, this, remoteFilePath, localFilePath);
  }

  public boolean Eof(String handle) {
    return chilkatJNI.CkSFtp_Eof(swigCPtr, this, handle);
  }

  public CkDateTime GetFileCreateDt(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    long cPtr = chilkatJNI.CkSFtp_GetFileCreateDt(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
    return (cPtr == 0) ? null : new CkDateTime(cPtr, true);
  }

  public boolean GetFileCreateTime(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle, SYSTEMTIME outSysTime) {
    return chilkatJNI.CkSFtp_GetFileCreateTime(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public boolean GetFileCreateTimeStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle, CkString outStr) {
    return chilkatJNI.CkSFtp_GetFileCreateTimeStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle, CkString.getCPtr(outStr), outStr);
  }

  public String getFileCreateTimeStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_getFileCreateTimeStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public String fileCreateTimeStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_fileCreateTimeStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public boolean GetFileGroup(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle, CkString outStr) {
    return chilkatJNI.CkSFtp_GetFileGroup(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle, CkString.getCPtr(outStr), outStr);
  }

  public String getFileGroup(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_getFileGroup(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public String fileGroup(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_fileGroup(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public boolean GetFileLastAccess(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle, SYSTEMTIME outSysTime) {
    return chilkatJNI.CkSFtp_GetFileLastAccess(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public CkDateTime GetFileLastAccessDt(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    long cPtr = chilkatJNI.CkSFtp_GetFileLastAccessDt(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
    return (cPtr == 0) ? null : new CkDateTime(cPtr, true);
  }

  public boolean GetFileLastAccessStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle, CkString outStr) {
    return chilkatJNI.CkSFtp_GetFileLastAccessStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle, CkString.getCPtr(outStr), outStr);
  }

  public String getFileLastAccessStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_getFileLastAccessStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public String fileLastAccessStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_fileLastAccessStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public boolean GetFileLastModified(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle, SYSTEMTIME outSysTime) {
    return chilkatJNI.CkSFtp_GetFileLastModified(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public CkDateTime GetFileLastModifiedDt(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    long cPtr = chilkatJNI.CkSFtp_GetFileLastModifiedDt(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
    return (cPtr == 0) ? null : new CkDateTime(cPtr, true);
  }

  public boolean GetFileLastModifiedStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle, CkString outStr) {
    return chilkatJNI.CkSFtp_GetFileLastModifiedStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle, CkString.getCPtr(outStr), outStr);
  }

  public String getFileLastModifiedStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_getFileLastModifiedStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public String fileLastModifiedStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_fileLastModifiedStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public boolean GetFileOwner(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle, CkString outStr) {
    return chilkatJNI.CkSFtp_GetFileOwner(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle, CkString.getCPtr(outStr), outStr);
  }

  public String getFileOwner(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_getFileOwner(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public String fileOwner(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_fileOwner(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public int GetFilePermissions(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_GetFilePermissions(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public int GetFileSize32(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_GetFileSize32(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public SWIGTYPE_p___int64 GetFileSize64(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return new SWIGTYPE_p___int64(chilkatJNI.CkSFtp_GetFileSize64(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle), true);
  }

  public boolean GetFileSizeStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle, CkString outStr) {
    return chilkatJNI.CkSFtp_GetFileSizeStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle, CkString.getCPtr(outStr), outStr);
  }

  public String getFileSizeStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_getFileSizeStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public String fileSizeStr(String filenameOrHandle, boolean bFollowLinks, boolean bIsHandle) {
    return chilkatJNI.CkSFtp_fileSizeStr(swigCPtr, this, filenameOrHandle, bFollowLinks, bIsHandle);
  }

  public boolean InitializeSftp() {
    return chilkatJNI.CkSFtp_InitializeSftp(swigCPtr, this);
  }

  public boolean LastReadFailed(String handle) {
    return chilkatJNI.CkSFtp_LastReadFailed(swigCPtr, this, handle);
  }

  public int LastReadNumBytes(String handle) {
    return chilkatJNI.CkSFtp_LastReadNumBytes(swigCPtr, this, handle);
  }

  public boolean OpenDir(String path, CkString outStr) {
    return chilkatJNI.CkSFtp_OpenDir(swigCPtr, this, path, CkString.getCPtr(outStr), outStr);
  }

  public String openDir(String path) {
    return chilkatJNI.CkSFtp_openDir(swigCPtr, this, path);
  }

  public boolean OpenFile(String filename, String access, String createDisp, CkString outStr) {
    return chilkatJNI.CkSFtp_OpenFile(swigCPtr, this, filename, access, createDisp, CkString.getCPtr(outStr), outStr);
  }

  public String openFile(String filename, String access, String createDisp) {
    return chilkatJNI.CkSFtp_openFile(swigCPtr, this, filename, access, createDisp);
  }

  public CkSFtpDir ReadDir(String handle) {
    long cPtr = chilkatJNI.CkSFtp_ReadDir(swigCPtr, this, handle);
    return (cPtr == 0) ? null : new CkSFtpDir(cPtr, true);
  }

  public boolean ReadFileBytes(String handle, int numBytes, CkByteData outBytes) {
    return chilkatJNI.CkSFtp_ReadFileBytes(swigCPtr, this, handle, numBytes, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ReadFileBytes32(String handle, int offset, int numBytes, CkByteData outBytes) {
    return chilkatJNI.CkSFtp_ReadFileBytes32(swigCPtr, this, handle, offset, numBytes, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ReadFileBytes64(String handle, SWIGTYPE_p___int64 offset64, int numBytes, CkByteData outBytes) {
    return chilkatJNI.CkSFtp_ReadFileBytes64(swigCPtr, this, handle, SWIGTYPE_p___int64.getCPtr(offset64), numBytes, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ReadFileBytes64s(String handle, String offset64, int numBytes, CkByteData outBytes) {
    return chilkatJNI.CkSFtp_ReadFileBytes64s(swigCPtr, this, handle, offset64, numBytes, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ReadFileText(String handle, int numBytes, String charset, CkString outStr) {
    return chilkatJNI.CkSFtp_ReadFileText(swigCPtr, this, handle, numBytes, charset, CkString.getCPtr(outStr), outStr);
  }

  public String readFileText(String handle, int numBytes, String charset) {
    return chilkatJNI.CkSFtp_readFileText(swigCPtr, this, handle, numBytes, charset);
  }

  public boolean ReadFileText32(String handle, int offset32, int numBytes, String charset, CkString outStr) {
    return chilkatJNI.CkSFtp_ReadFileText32(swigCPtr, this, handle, offset32, numBytes, charset, CkString.getCPtr(outStr), outStr);
  }

  public String readFileText32(String handle, int offset32, int numBytes, String charset) {
    return chilkatJNI.CkSFtp_readFileText32(swigCPtr, this, handle, offset32, numBytes, charset);
  }

  public boolean ReadFileText64(String handle, SWIGTYPE_p___int64 offset64, int numBytes, String charset, CkString outStr) {
    return chilkatJNI.CkSFtp_ReadFileText64(swigCPtr, this, handle, SWIGTYPE_p___int64.getCPtr(offset64), numBytes, charset, CkString.getCPtr(outStr), outStr);
  }

  public String readFileText64(String handle, SWIGTYPE_p___int64 offset64, int numBytes, String charset) {
    return chilkatJNI.CkSFtp_readFileText64(swigCPtr, this, handle, SWIGTYPE_p___int64.getCPtr(offset64), numBytes, charset);
  }

  public boolean ReadFileText64s(String handle, String offset64, int numBytes, String charset, CkString outStr) {
    return chilkatJNI.CkSFtp_ReadFileText64s(swigCPtr, this, handle, offset64, numBytes, charset, CkString.getCPtr(outStr), outStr);
  }

  public String readFileText64s(String handle, String offset64, int numBytes, String charset) {
    return chilkatJNI.CkSFtp_readFileText64s(swigCPtr, this, handle, offset64, numBytes, charset);
  }

  public boolean RealPath(String originalPath, String composePath, CkString outStr) {
    return chilkatJNI.CkSFtp_RealPath(swigCPtr, this, originalPath, composePath, CkString.getCPtr(outStr), outStr);
  }

  public String realPath(String originalPath, String composePath) {
    return chilkatJNI.CkSFtp_realPath(swigCPtr, this, originalPath, composePath);
  }

  public boolean RemoveDir(String path) {
    return chilkatJNI.CkSFtp_RemoveDir(swigCPtr, this, path);
  }

  public boolean RemoveFile(String filename) {
    return chilkatJNI.CkSFtp_RemoveFile(swigCPtr, this, filename);
  }

  public boolean RenameFileOrDir(String oldPath, String newPath) {
    return chilkatJNI.CkSFtp_RenameFileOrDir(swigCPtr, this, oldPath, newPath);
  }

  public boolean ResumeDownloadFileByName(String remoteFilePath, String localFilePath) {
    return chilkatJNI.CkSFtp_ResumeDownloadFileByName(swigCPtr, this, remoteFilePath, localFilePath);
  }

  public boolean ResumeUploadFileByName(String remoteFilePath, String localFilePath) {
    return chilkatJNI.CkSFtp_ResumeUploadFileByName(swigCPtr, this, remoteFilePath, localFilePath);
  }

  public boolean SetCreateDt(String pathOrHandle, boolean bIsHandle, CkDateTime createTime) {
    return chilkatJNI.CkSFtp_SetCreateDt(swigCPtr, this, pathOrHandle, bIsHandle, CkDateTime.getCPtr(createTime), createTime);
  }

  public boolean SetCreateTime(String pathOrHandle, boolean bIsHandle, SYSTEMTIME createTime) {
    return chilkatJNI.CkSFtp_SetCreateTime(swigCPtr, this, pathOrHandle, bIsHandle, SYSTEMTIME.getCPtr(createTime), createTime);
  }

  public boolean SetCreateTimeStr(String pathOrHandle, boolean bIsHandle, String dateTimeStr) {
    return chilkatJNI.CkSFtp_SetCreateTimeStr(swigCPtr, this, pathOrHandle, bIsHandle, dateTimeStr);
  }

  public boolean SetLastAccessDt(String pathOrHandle, boolean bIsHandle, CkDateTime createTime) {
    return chilkatJNI.CkSFtp_SetLastAccessDt(swigCPtr, this, pathOrHandle, bIsHandle, CkDateTime.getCPtr(createTime), createTime);
  }

  public boolean SetLastAccessTime(String pathOrHandle, boolean bIsHandle, SYSTEMTIME createTime) {
    return chilkatJNI.CkSFtp_SetLastAccessTime(swigCPtr, this, pathOrHandle, bIsHandle, SYSTEMTIME.getCPtr(createTime), createTime);
  }

  public boolean SetLastAccessTimeStr(String pathOrHandle, boolean bIsHandle, String dateTimeStr) {
    return chilkatJNI.CkSFtp_SetLastAccessTimeStr(swigCPtr, this, pathOrHandle, bIsHandle, dateTimeStr);
  }

  public boolean SetLastModifiedDt(String pathOrHandle, boolean bIsHandle, CkDateTime createTime) {
    return chilkatJNI.CkSFtp_SetLastModifiedDt(swigCPtr, this, pathOrHandle, bIsHandle, CkDateTime.getCPtr(createTime), createTime);
  }

  public boolean SetLastModifiedTime(String pathOrHandle, boolean bIsHandle, SYSTEMTIME createTime) {
    return chilkatJNI.CkSFtp_SetLastModifiedTime(swigCPtr, this, pathOrHandle, bIsHandle, SYSTEMTIME.getCPtr(createTime), createTime);
  }

  public boolean SetLastModifiedTimeStr(String pathOrHandle, boolean bIsHandle, String dateTimeStr) {
    return chilkatJNI.CkSFtp_SetLastModifiedTimeStr(swigCPtr, this, pathOrHandle, bIsHandle, dateTimeStr);
  }

  public boolean SetOwnerAndGroup(String pathOrHandle, boolean bIsHandle, String owner, String group) {
    return chilkatJNI.CkSFtp_SetOwnerAndGroup(swigCPtr, this, pathOrHandle, bIsHandle, owner, group);
  }

  public boolean SetPermissions(String pathOrHandle, boolean bIsHandle, int perm) {
    return chilkatJNI.CkSFtp_SetPermissions(swigCPtr, this, pathOrHandle, bIsHandle, perm);
  }

  public boolean SyncTreeDownload(String remoteRoot, String localRoot, int mode, boolean recurse) {
    return chilkatJNI.CkSFtp_SyncTreeDownload(swigCPtr, this, remoteRoot, localRoot, mode, recurse);
  }

  public boolean SyncTreeUpload(String localBaseDir, String remoteBaseDir, int mode, boolean bRecurse) {
    return chilkatJNI.CkSFtp_SyncTreeUpload(swigCPtr, this, localBaseDir, remoteBaseDir, mode, bRecurse);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkSFtp_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean UploadFile(String handle, String fromFilename) {
    return chilkatJNI.CkSFtp_UploadFile(swigCPtr, this, handle, fromFilename);
  }

  public boolean UploadFileByName(String remoteFilePath, String localFilePath) {
    return chilkatJNI.CkSFtp_UploadFileByName(swigCPtr, this, remoteFilePath, localFilePath);
  }

  public boolean WriteFileBytes(String handle, CkByteData data) {
    return chilkatJNI.CkSFtp_WriteFileBytes(swigCPtr, this, handle, CkByteData.getCPtr(data), data);
  }

  public boolean WriteFileBytes32(String handle, int offset, CkByteData data) {
    return chilkatJNI.CkSFtp_WriteFileBytes32(swigCPtr, this, handle, offset, CkByteData.getCPtr(data), data);
  }

  public boolean WriteFileBytes64(String handle, SWIGTYPE_p___int64 offset64, CkByteData data) {
    return chilkatJNI.CkSFtp_WriteFileBytes64(swigCPtr, this, handle, SWIGTYPE_p___int64.getCPtr(offset64), CkByteData.getCPtr(data), data);
  }

  public boolean WriteFileBytes64s(String handle, String offset64, CkByteData data) {
    return chilkatJNI.CkSFtp_WriteFileBytes64s(swigCPtr, this, handle, offset64, CkByteData.getCPtr(data), data);
  }

  public boolean WriteFileText(String handle, String charset, String textData) {
    return chilkatJNI.CkSFtp_WriteFileText(swigCPtr, this, handle, charset, textData);
  }

  public boolean WriteFileText32(String handle, int offset32, String charset, String textData) {
    return chilkatJNI.CkSFtp_WriteFileText32(swigCPtr, this, handle, offset32, charset, textData);
  }

  public boolean WriteFileText64(String handle, SWIGTYPE_p___int64 offset64, String charset, String textData) {
    return chilkatJNI.CkSFtp_WriteFileText64(swigCPtr, this, handle, SWIGTYPE_p___int64.getCPtr(offset64), charset, textData);
  }

  public boolean WriteFileText64s(String handle, String offset64, String charset, String textData) {
    return chilkatJNI.CkSFtp_WriteFileText64s(swigCPtr, this, handle, offset64, charset, textData);
  }

}
